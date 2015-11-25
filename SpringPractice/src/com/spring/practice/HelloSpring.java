package com.spring.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.practice.pojos.Test;

public class HelloSpring {

	public static void main(String[] args) {
			HelloSpring HelloSpring_obj = new HelloSpring();
			HelloSpring_obj.operations();
	}

	private void operations() {
		// Find XML File..
		Resource resource = new ClassPathResource("xmlfiles/spring.xml");
		// Load XML File...
		 BeanFactory beanFactory = new XmlBeanFactory(resource);
		 Test test = beanFactory.getBean(Test.class);
		 test.sample();
	}

}
