package com.spring.practice.propertys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		Testing Testing_obj = new Testing();
		Testing_obj.operation();
	}

	private void operation() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlfiles/propertyDI.xml");
		PropertyDependencyInjection injection = (PropertyDependencyInjection) applicationContext.getBean("propertyDependency");
		System.out.println("\n user name is: "+injection.getDriver());

	}

}
