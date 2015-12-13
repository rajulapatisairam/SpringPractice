package com.spring.practice.pojos.steriotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SterioPojoClass {
	private int pojoId;
	private String sterioType;
	@Autowired
	private SterioDependentPojo dependentPojo;
	public int getPojoId() {
		return pojoId;
	}
	public void setPojoId(int pojoId) {
		this.pojoId = pojoId;
	}
	public String getSterioType() {
		return sterioType;
	}
	public void setSterioType(String sterioType) {
		this.sterioType = sterioType;
	}
	public SterioDependentPojo getDependentPojo() {
		return dependentPojo;
	}
	public void setDependentPojo(SterioDependentPojo dependentPojo) {
		this.dependentPojo = dependentPojo;
	}
}
