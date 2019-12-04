package com.arkfancy.pokemon.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arkfancy.pokemon.entity.Dungeon;
import com.arkfancy.pokemon.mapper.DungeonMapper;
import com.arkfancy.pokemon.service.DungeonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 副本 服务实现类
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
@Service
public class DungeonServiceImpl extends ServiceImpl<DungeonMapper, Dungeon> implements DungeonService {

	@Override
	public List<Dungeon> selectDungeonList(String recodeDate) {
		return baseMapper.selectDungeonList(recodeDate);
	}

	@Override
	public List<Dungeon> selectDungeonContributionSum(String previousDate, String currentDate) {
		return baseMapper.selectDungeonContributionSum(previousDate, currentDate);
	}

}
