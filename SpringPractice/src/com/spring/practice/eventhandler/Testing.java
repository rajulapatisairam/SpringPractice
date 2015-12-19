/**
 * 
 */
package com.spring.practice.eventhandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sairam Rajulapati
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlfiles/eventListener.xml");
		applicationContext.start();
		applicationContext.stop();
		applicationContext.refresh();

	}

}
