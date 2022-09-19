package com.start.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/Greetings")
public class RestController {
	
	@GetMapping("/greet")
	public String Welcome()
	{
	        System.out.println("method execution started");
		return "Welcome to Boot";
	}
	

}
