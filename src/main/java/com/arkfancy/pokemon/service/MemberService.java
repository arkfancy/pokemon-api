package com.arkfancy.pokemon.service;

import java.util.List;

import com.arkfancy.pokemon.entity.Member;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
public interface MemberService extends IService<Member> {

	Page<Member> selectMemberPage(Page<Member> page, boolean containLeave);

	List<Member> selectMemberList(boolean containLeave);
}
