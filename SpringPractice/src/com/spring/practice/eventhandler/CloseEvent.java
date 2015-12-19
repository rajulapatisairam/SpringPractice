package com.spring.practice.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CloseEvent implements ApplicationListener<ContextClosedEvent> {

	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("\n ON IOC Close !...");
	}

}
