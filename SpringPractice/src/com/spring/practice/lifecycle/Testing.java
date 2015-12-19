package com.spring.practice.lifecycle;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		Testing Testing_obj = new Testing();
		Testing_obj.operation();
	}

	private void operation() {
		 
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlfiles/lifecycel.xml");
		PojoClass class1 = (PojoClass) applicationContext.getBean("lCycel");
		applicationContext.close();
		
	}

}
