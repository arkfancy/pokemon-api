package com.arkfancy.pokemon.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.domain.vo.WarehouseDistributionSumVO;
import com.arkfancy.pokemon.domain.vo.WarehouseDistributionVO;
import com.arkfancy.pokemon.entity.WarehouseDistribution;
import com.arkfancy.pokemon.service.WarehouseDistributionService;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 仓库分配 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@RestController
@RequestMapping("/warehouse-distribution")
public class WarehouseDistributionController extends ApiController {

	@Autowired
	private WarehouseDistributionService warehouseDistributionService;

	@GetMapping("/page/{current}-{size}")
	public R<Page<WarehouseDistributionVO>> selectPage(@PathVariable Integer current, @PathVariable Integer size) {
		return success(warehouseDistributionService.selectDistributionDetailPage(new Page<>(current, size)));
	}

	/**
	 * 获取每个人的分配总和及各道具的分配总和
	 * 
	 * @author arkfancy
	 * @date 2019年9月27日 上午10:58:31
	 * @return
	 */
	@GetMapping("/sum")
	public R<List<WarehouseDistributionSumVO>> sum(@RequestParam(required=false) String itemId) {
		List<WarehouseDistributionSumVO> result = new ArrayList<>();
		warehouseDistributionService.selectDistributionSum(itemId).stream()
				.collect(Collectors.groupingBy(WarehouseDistributionVO::getMemberName)).forEach((memberName, vos) -> {
					WarehouseDistributionSumVO sumVo = new WarehouseDistributionSumVO();
					sumVo.setMemberName(memberName);
					// 合并
					sumVo.setSum(vos.stream().map(WarehouseDistributionVO::getQuantity).reduce(0, (a, b) -> (a + b)));
					// 排序
					Collections.sort(vos, (a, b) -> a.getItemId() - b.getItemId());
					sumVo.setList(vos);
					result.add(sumVo);
				});
		// 按总和降序
		Collections.sort(result, (a, b) -> b.getSum() - a.getSum());
		return success(result);
	}

	@PostMapping("/list")
	@Login
	public R<List<WarehouseDistribution>> itemToUser(@RequestBody List<WarehouseDistribution> warehouseDistribution) {
		List<WarehouseDistribution> listWithoutEmptyQuantity = warehouseDistribution.stream()
				.filter(e -> e.getQuantity() != null && e.getQuantity() > 0).collect(Collectors.toList());
		warehouseDistributionService.saveBatch(listWithoutEmptyQuantity);
		return success(listWithoutEmptyQuantity);
	}

}
