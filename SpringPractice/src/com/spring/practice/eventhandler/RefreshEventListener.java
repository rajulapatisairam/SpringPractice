package com.spring.practice.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RefreshEventListener implements ApplicationListener<ContextRefreshedEvent> {

	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(" IOC is Refreshed !... while context start up");
	}

}
