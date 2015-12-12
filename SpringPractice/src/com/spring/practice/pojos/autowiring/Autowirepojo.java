package com.spring.practice.pojos.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Autowirepojo {
	private String name;
	@Qualifier(value="pojo1")
	@Autowired
	private DepencyPojo1 pojo1;
	private DepencyPojo2 pojo2;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DepencyPojo1 getPojo1() {
		return pojo1;
	}
	public void setPojo1(DepencyPojo1 pojo1) {
		this.pojo1 = pojo1;
	}
	public DepencyPojo2 getPojo2() {
		return pojo2;
	}
	public void setPojo2(DepencyPojo2 pojo2) {
		this.pojo2 = pojo2;
	}
	
	

}
