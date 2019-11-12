package com.arkfancy.pokemon.mapper;

import java.util.List;

import com.arkfancy.pokemon.domain.vo.ContributionVO;
import com.arkfancy.pokemon.entity.Contribution;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 贡献 Mapper 接口
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
public interface ContributionMapper extends BaseMapper<Contribution> {

	/**
	 * 查询最近一次贡献列表
	 * 
	 * @author arkfancy 2019年9月12日 下午3:07:15
	 * @return
	 */
	@Deprecated
	List<ContributionVO> selectLastContributionList();

	List<ContributionVO> selectContributionList(String recodeDate);
}
