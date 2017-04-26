package com.huawei.test.singleton;

public class Employee {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void print() {
		System.out.println(hashCode());
	}

}
