package com.arkfancy.pokemon.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arkfancy.pokemon.entity.Member;
import com.arkfancy.pokemon.mapper.MemberMapper;
import com.arkfancy.pokemon.service.MemberService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

	@Override
	public Page<Member> selectMemberPage(Page<Member> page, boolean containLeave) {
		return baseMapper.selectMembers(page, containLeave);
	}

	@Override
	public List<Member> selectMemberList(boolean containLeave) {
		return baseMapper.selectMembers(containLeave);
	}

}
