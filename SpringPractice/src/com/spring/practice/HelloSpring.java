package com.spring.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.practice.pojos.Car;
import com.spring.practice.pojos.Enginee;
import com.spring.practice.pojos.Maruthi;
import com.spring.practice.pojos.Pojo;
import com.spring.practice.pojos.Test;
import com.spring.practice.pojos.Test2;

public class HelloSpring {
	private static final String LOCATION = "xmlfiles/spring.xml";
	public static void main(String[] args) {
			HelloSpring HelloSpring_obj = new HelloSpring();
			HelloSpring_obj.operations();
	}

	private ClassPathResource resource;

	private void operations() {
		resource = new ClassPathResource(LOCATION);
		//coreContainer();
		//applicationContextListener();
		//passParametersToPojo();
		//passRefferencessToClass();
		primativeAndSecondayTypeArray();
		
	}
		private void primativeAndSecondayTypeArray() {
			ApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
			Maruthi maruthi = context.getBean(Maruthi.class);
			for( String car : maruthi.getModels()){
				System.out.println(" Model is : "+car);
			}
			for( Enginee enginee : maruthi.getEnginees()){
				System.out.println("\n Enginee Name is : "+enginee.getEngineeName()+" Capacity is: "+enginee.getCapacity());
			}
			
	}
		private void passRefferencessToClass() {
			ApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
			Car car = context.getBean(Car.class);
			System.out.println(" Car name is : "+car.getCarName()+"\n Enginee Details "+car.getEnginee().getEngineeName()+" Capacity is: "+car.getEnginee().getCapacity());
	}
		private void passParametersToPojo() {
			BeanFactory  beanFactory = new XmlBeanFactory(resource);
			Pojo pojo =beanFactory.getBean(Pojo.class);
			pojo.callName();
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
