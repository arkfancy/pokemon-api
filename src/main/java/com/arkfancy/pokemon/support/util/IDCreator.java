package com.arkfancy.pokemon.support.util;

public class IDCreator {

	public static Integer hashCodeId(String seed) {
		return Math.abs(seed.hashCode());
	}

}
