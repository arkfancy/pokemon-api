package com.arkfancy.pokemon.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arkfancy.pokemon.domain.vo.WarehouseDistributionVO;
import com.arkfancy.pokemon.entity.WarehouseDistribution;
import com.arkfancy.pokemon.mapper.WarehouseDistributionMapper;
import com.arkfancy.pokemon.service.WarehouseDistributionService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 仓库分配 服务实现类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@Service
public class WarehouseDistributionServiceImpl extends ServiceImpl<WarehouseDistributionMapper, WarehouseDistribution> implements WarehouseDistributionService {

	@Override
	public Page<WarehouseDistributionVO> selectDistributionDetailPage(Page<?> page) {
		return baseMapper.selectDistributionDetailPage(page);
	}

	@Override
	public List<WarehouseDistributionVO> selectDistributionSum() {
		return baseMapper.selectDistributionSum();
	}
}
