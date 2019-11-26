package com.arkfancy.pokemon.mapper;

import java.util.List;

import com.arkfancy.pokemon.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
public interface MemberMapper extends BaseMapper<Member> {

	Page<Member> selectMembers(Page<?> page, boolean containLeave);

	List<Member> selectMembers(boolean containLeave);
}
