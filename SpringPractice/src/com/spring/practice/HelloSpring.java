package com.spring.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.practice.pojos.Test;
import com.spring.practice.pojos.Test2;

public class HelloSpring {

	public static void main(String[] args) {
			HelloSpring HelloSpring_obj = new HelloSpring();
			HelloSpring_obj.operations();
	}

	private ClassPathResource resource;

	private void operations() {
		resource = new ClassPathResource("xmlfiles/spring.xml");
		//coreContainer();
		applicationContextListener();
		
		
	}
		private void applicationContextListener() {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlfiles/spring.xml");
			Test test = applicationContext.getBean(Test.class);
			Test2 test2 = applicationContext.getBean(Test2.class);
	}

		private void coreContainer(){
		// Find XML File..
			
		// Load XML File...
		 BeanFactory beanFactory = new XmlBeanFactory(resource);
		 Test test = (Test) beanFactory.getBean("test");
		 Test test3 = (Test) beanFactory.getBean("test");
		 
		 Test2 test1 = beanFactory.getBean(Test2.class);
		 Test2 test2 = beanFactory.getBean(Test2.class);
		 
		 test.sample();
		 test1.sample();
		 test2.sample();
		 
	}

}
