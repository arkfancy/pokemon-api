package com.arkfancy.pokemon.domain.vo;

import com.arkfancy.pokemon.entity.Dungeon;

public class DungeonVO extends Dungeon {

	private static final long serialVersionUID = 1L;

	private String memberName;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
