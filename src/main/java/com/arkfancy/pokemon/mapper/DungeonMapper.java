package com.arkfancy.pokemon.mapper;

import java.util.List;

import com.arkfancy.pokemon.entity.Dungeon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 副本 Mapper 接口
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
public interface DungeonMapper extends BaseMapper<Dungeon> {

	List<Dungeon> selectDungeonList(String recodeDate);

}
