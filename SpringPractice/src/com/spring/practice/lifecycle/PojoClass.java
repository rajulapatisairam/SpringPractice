package com.spring.practice.lifecycle;

public class PojoClass {
	private void init(){
		System.out.println(" Pojo Class Init");
	}
	
	private String pojoName;
	private void destroy(){
		System.out.println(" Pojo Class Destroyed!..");
	}
	public String getPojoName() {
		return pojoName;
	}
	public void setPojoName(String pojoName) {
		this.pojoName = pojoName;
	}
	
}
