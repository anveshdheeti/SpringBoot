package com.start.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/greet")
	public String Welcome()
	{
	        System.out.println("method execution started");
		return "Welcome to Boot";
	}
	

}
