package com.arkfancy.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.entity.Member;
import com.arkfancy.pokemon.service.MemberService;
import com.arkfancy.pokemon.support.util.IDCreator;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@RestController
@RequestMapping("/member")
public class MemberController extends ApiController {

	@Autowired
	private MemberService memberService;

	@GetMapping("/list")
	public R<List<Member>> selectList(@RequestParam(defaultValue = "false") boolean containLeave) {
//		return success(new Member()
//				.selectList(new QueryWrapper<Member>().isNull(!containLeave, Member.LEAVE_DATE).orderByAsc(Member.ID)));
		return success(memberService.selectMemberList(containLeave));
	}

	@GetMapping("/page/{current}-{size}")
	public R<IPage<Member>> selectPage(@PathVariable Integer current, @PathVariable Integer size,
			@RequestParam(defaultValue = "false") boolean containLeave) {
//		return success(new Member().selectPage(new Page<>(current, size),
//				new QueryWrapper<Member>().isNull(!containLeave, Member.LEAVE_DATE).orderByAsc(Member.ID)));
		return success(memberService.selectMemberPage(new Page<>(current, size), containLeave));
	}

	@PostMapping("")
	@Login
	public R<Member> insert(@RequestBody Member member) {
		member.setMemberId(IDCreator.hashCodeId(member.getMemberName() + member.getJoinDate())).insert();
		return success(member);
	}
}
