package com.arkfancy.pokemon.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arkfancy.pokemon.domain.vo.ContributionVO;
import com.arkfancy.pokemon.entity.Contribution;
import com.arkfancy.pokemon.mapper.ContributionMapper;
import com.arkfancy.pokemon.service.ContributionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 贡献 服务实现类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@Service
public class ContributionServiceImpl extends ServiceImpl<ContributionMapper, Contribution>
		implements ContributionService {

	@Override
	@Deprecated
	public List<ContributionVO> selectLastContributionList() {
		return baseMapper.selectLastContributionList();
	}

	@Override
	public List<ContributionVO> selectContributionList(String recodeDate) {
		return baseMapper.selectContributionList(recodeDate);
	}
}
