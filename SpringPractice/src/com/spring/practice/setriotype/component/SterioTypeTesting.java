package com.spring.practice.setriotype.component;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.pojos.steriotype.SterioPojoClass;

class SterioTypeTesting {
	private static final String LOCATION = "xmlfiles/steriotype.xml";
	public static void main(String[] args) {
		SterioTypeTesting SterioTypeTesting_obj = new SterioTypeTesting();
		SterioTypeTesting_obj.opration();
	}
 
	private void opration() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(LOCATION);
		SterioPojoClass pojoClass = applicationContext.getBean(SterioPojoClass.class);
		System.out.println(" Pojo Name is : "+pojoClass.getPojoId()+" dependency Pojo : "+pojoClass.getDependentPojo().getPojoName());
		Calendar.getInstance();
	}

}
