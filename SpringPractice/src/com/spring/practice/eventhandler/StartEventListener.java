package com.spring.practice.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventListener implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println("\n ON IOC Start ");
	}
	

}
