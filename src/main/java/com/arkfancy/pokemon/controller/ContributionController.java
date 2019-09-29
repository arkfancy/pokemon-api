package com.arkfancy.pokemon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.domain.vo.ContributionVO;
import com.arkfancy.pokemon.entity.Contribution;
import com.arkfancy.pokemon.entity.WarehouseDistribution;
import com.arkfancy.pokemon.service.ContributionService;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;

/**
 * <p>
 * 贡献 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@RestController
@RequestMapping("/contribution")
public class ContributionController extends ApiController {

	@Autowired
	private ContributionService contributionService;

	@GetMapping("/list")
	public R<List<ContributionVO>> selectList() {
		return success(contributionService.selectLastContributionList());
	}

	@PostMapping("/list")
	@Login
	public R<List<Contribution>> insertList(@RequestBody List<Contribution> contributions) {
		List<Contribution> listWithoutEmptyContribution = contributions.stream()
				.filter(e -> e.getContribution() != null && e.getContribution() > 0).collect(Collectors.toList());
		contributionService.saveBatch(listWithoutEmptyContribution);
		return success(contributions);
	}

}
