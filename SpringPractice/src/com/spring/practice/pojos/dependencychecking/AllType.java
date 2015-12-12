package com.spring.practice.pojos.dependencychecking;

import org.springframework.beans.factory.annotation.Required;

public class AllType {
	private int number;
	
	private String name;
	private SampleObject sampleObject;
	public int getNumber() {
		return number;
	}
	@Required
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SampleObject getSampleObject() {
		return sampleObject;
	}
	@Required
	public void setSampleObject(SampleObject sampleObject) {
		this.sampleObject = sampleObject;
	}
	
	
}
