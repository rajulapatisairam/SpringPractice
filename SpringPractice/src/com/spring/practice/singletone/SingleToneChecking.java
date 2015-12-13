package com.spring.practice.singletone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.pojos.singletone.SingleTonePojo;

public class SingleToneChecking {

	private static final String LOCATION = "xmlfiles/singletone.xml";
	public static void main(String[] args) {
		
		SingleToneChecking SingleToneChecking_obj = new SingleToneChecking();
		SingleToneChecking_obj.operation();
	}

	private void operation() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(LOCATION);
		SingleTonePojo pojo = applicationContext.getBean(SingleTonePojo.class);
		System.out.println("\n Name is : "+pojo.getPojoName());
		
	}

}
