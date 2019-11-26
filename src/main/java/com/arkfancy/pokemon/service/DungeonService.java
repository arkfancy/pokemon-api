package com.arkfancy.pokemon.service;

import java.util.List;

import com.arkfancy.pokemon.entity.Dungeon;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 副本 服务类
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
public interface DungeonService extends IService<Dungeon> {

	/**
	 * 查询副本贡献列表 无日期时查询最近一次
	 * 
	 * @author arkfancy
	 * @date 2019年11月26日 下午5:00:00
	 * @param recodeDate
	 * @return
	 */
	List<Dungeon> selectDungeonList(String recodeDate);

}
