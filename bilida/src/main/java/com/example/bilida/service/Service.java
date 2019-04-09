package com.example.bilida.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Value("${welcome.message}")
	private String welcomeMessage;

	public String retrieveWelcomeMessage() {
		return welcomeMessage;
	}
	
	public String retrieveWelcomeMessage(String name) {
		return welcomeMessage + ", " + name;
	}
}

