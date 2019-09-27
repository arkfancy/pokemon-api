package com.arkfancy.pokemon.service;

import java.util.List;

import com.arkfancy.pokemon.domain.vo.ContributionVO;
import com.arkfancy.pokemon.entity.Contribution;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 贡献 服务类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
public interface ContributionService extends IService<Contribution> {
	
	/**
	 * 查询最近一次贡献列表
	 * 
	 * @author arkfancy 2019年9月12日 下午3:06:25
	 * @return
	 */
	List<ContributionVO> selectLastContributionList();
}
