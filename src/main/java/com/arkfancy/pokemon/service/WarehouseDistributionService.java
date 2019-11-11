package com.arkfancy.pokemon.service;

import java.util.List;

import com.arkfancy.pokemon.domain.vo.WarehouseDistributionVO;
import com.arkfancy.pokemon.entity.WarehouseDistribution;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 仓库分配 服务类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
public interface WarehouseDistributionService extends IService<WarehouseDistribution> {

	/**
	 * 查询仓库分配明细
	 * 
	 * @author arkfancy
	 * @date 2019年9月12日 下午3:16:55
	 * @param page
	 * @return
	 */
	Page<WarehouseDistributionVO> selectDistributionDetailPage(Page<?> page);

	/**
	 * 查询各成员各道具分配总和
	 * 
	 * @author arkfancy
	 * @date 2019年9月12日 下午3:22:58
	 * @return
	 */
	List<WarehouseDistributionVO> selectDistributionSum(String itemId);
}
