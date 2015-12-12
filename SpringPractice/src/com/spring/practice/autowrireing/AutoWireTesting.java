package com.spring.practice.autowrireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.pojos.autowiring.Autowirepojo;
import com.spring.practice.pojos.autowiring.DepencyPojo1;

public class AutoWireTesting {

	public static void main(String[] args) {
		AutoWireTesting AutoWireTesting_obj = new AutoWireTesting();
		AutoWireTesting_obj.operation();
		
	}

	private void operation() {
		checking();
		
	}

	private void checking() {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlfiles/autowire.xml");
		Autowirepojo autowirepojo = context.getBean(Autowirepojo.class);
		DepencyPojo1 pojo1 = context.getBean(DepencyPojo1.class);
		if(autowirepojo.getPojo1() !=null){
		System.out.println(" Dj Object 1 : "+autowirepojo.getPojo1().getName());//+"\n Dj Object 2 : "+autowirepojo.getPojo2().getName());
		}
	}
	

}
