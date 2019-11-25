package com.arkfancy.pokemon.domain.vo;

import com.arkfancy.pokemon.entity.Member;

public class MemberVO extends Member {

	private static final long serialVersionUID = 1L;

	private String rankName;

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

}
