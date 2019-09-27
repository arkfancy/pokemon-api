package com.arkfancy.pokemon.domain.vo;

import com.arkfancy.pokemon.entity.Contribution;

public class ContributionVO extends Contribution {

	private static final long serialVersionUID = 1L;

	public String memberName;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
