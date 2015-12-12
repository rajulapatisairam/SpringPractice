package com.spring.practice.dependencychecking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.pojos.dependencychecking.Simple;

public class DependencyCheckingTesting {
	private static final String LOCATION = "xmlfiles/dc.xml";
	public static void main(String[] args) {
		DependencyCheckingTesting DependencyCheckingTesting_obj = new DependencyCheckingTesting();
		DependencyCheckingTesting_obj.operations();
	}
	private void operations() {
		ApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
		Simple simple = context.getBean(Simple.class);
		System.out.println(" Simple age is: "+simple.getName());
		
		
	}

}
