package com.example.bilida.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bilida.model.User;
import com.example.bilida.service.Service;

//import Configuration.BasicConfiguration;

@RestController
public class Controller {

	@Autowired
	private Service service;

//	@Autowired
//	private BasicConfiguration configuration;

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("entered mapping /welcomeVV");
		return service.retrieveWelcomeMessage();
	}

	@GetMapping("/dynamic-configuration")
	//@ResponseBody
	public Map<String, Object> dynamicConfiguration() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "Tim");
		map.put("number", "10");
		map.put("value", "value");
		return map;
	}
	
	@GetMapping("/requestResponse")
	//@ResponseBody
	public Map<String, Object> requestResponse(@RequestBody User user) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("message", user.getMessage());
		map.put("number", user.getNumber());
		map.put("value", user.getValue());
		return map;
	}

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		System.out.println("entered mapping /welcome/{name}");
		return service.retrieveWelcomeMessage(name);
	}
}

