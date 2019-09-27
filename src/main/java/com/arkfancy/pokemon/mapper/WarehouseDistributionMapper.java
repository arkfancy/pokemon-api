package com.arkfancy.pokemon.mapper;

import java.util.List;

import com.arkfancy.pokemon.domain.vo.WarehouseDistributionVO;
import com.arkfancy.pokemon.entity.WarehouseDistribution;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 仓库分配 Mapper 接口
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
public interface WarehouseDistributionMapper extends BaseMapper<WarehouseDistribution> {

	/**
	 * 查询仓库分配明细
	 * 
	 * @author arkfancy 2019年9月12日 下午3:17:20
	 * @param page
	 * @return
	 */
	Page<WarehouseDistributionVO> selectDistributionDetailPage(Page<?> page);

	/**
	 * 查询各成员各道具分配总和
	 * 
	 * @author arkfancy 2019年9月12日 下午3:22:02
	 * @return
	 */
	List<WarehouseDistributionVO> selectDistributionSum();

}
