package com.spring.practice.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
private static final String LOCATION = "xmlfiles/lookup.xml";
	public static void main(String[] args) {
		Testing Testing_obj = new Testing();
		Testing_obj.operation();
		
	}

	private void operation() {
		ApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
		CareEngine careEngine = (CareEngine) context.getBean("carEnginee");
		System.out.println("\n Car Enginee is : "+careEngine.myEnginee().getEngineName());
		BusAbstractClass busAbstractClass = (BusAbstractClass) context.getBean("busEnginee");
		System.out.println("\n Bus Enginee is : "+busAbstractClass.busEnginee().getEngineName());
		ConcreateClass class1 = (ConcreateClass) context.getBean("TruckEnginee");
		System.out.println("\n Truck Enginee is : "+class1.myEnginee().getEngineName());
		
		
	}

}
