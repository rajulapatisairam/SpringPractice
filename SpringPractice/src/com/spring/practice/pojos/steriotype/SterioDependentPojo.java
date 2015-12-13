package com.spring.practice.pojos.steriotype;

import org.springframework.stereotype.Component;

@Component
public class SterioDependentPojo {
private int pojoNumber = 123;
private String pojoName = " Component Type ";
public int getPojoNumber() {
	return pojoNumber;
}
public void setPojoNumber(int pojoNumber) {
	this.pojoNumber = pojoNumber;
}
public String getPojoName() {
	return pojoName;
}
public void setPojoName(String pojoName) {
	this.pojoName = pojoName;
}


}
