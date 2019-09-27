package com.arkfancy.pokemon.domain.vo;

import java.io.Serializable;
import java.util.List;

public class WarehouseDistributionSumVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String memberName;

	private Integer sum;

	private List<WarehouseDistributionVO> list;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public List<WarehouseDistributionVO> getList() {
		return list;
	}

	public void setList(List<WarehouseDistributionVO> list) {
		this.list = list;
	}

}
