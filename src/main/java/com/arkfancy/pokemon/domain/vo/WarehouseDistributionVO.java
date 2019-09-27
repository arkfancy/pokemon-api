package com.arkfancy.pokemon.domain.vo;

import com.arkfancy.pokemon.entity.WarehouseDistribution;

public class WarehouseDistributionVO extends WarehouseDistribution {

	private static final long serialVersionUID = 1L;

	private String memberName;

	private String itemName;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
