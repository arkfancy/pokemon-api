package com.arkfancy.pokemon.service.impl;

import com.arkfancy.pokemon.entity.Member;
import com.arkfancy.pokemon.mapper.MemberMapper;
import com.arkfancy.pokemon.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
