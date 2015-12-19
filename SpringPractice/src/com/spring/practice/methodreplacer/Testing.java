package com.spring.practice.methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
	public static void main(String[] args) {
			Testing Testing_obj = new Testing();
			Testing_obj.operation();
	}

	private void operation() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlfiles/methodreplacer.xml");
		BankClass bankClass = (BankClass) applicationContext.getBean("bank");
		//System.out.println("\n Canonical Name : "+bankClass.getClass().getCanonicalName());
		bankClass.calucatingInterest(100);
		bankClass.withDraw();
	}

}
