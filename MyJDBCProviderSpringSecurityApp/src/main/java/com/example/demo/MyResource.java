package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {
	
	@GetMapping(value="/",produces="text/html")
	public String first(){
		return "<h1>Welcome!</h1>";
	}

	@GetMapping(value="/user",produces="text/html")
	public String second(){
		return "<h1>Welcome User!</h1>";
	}
	
	@GetMapping(value="/admin",produces="text/html")
	public String third(){
		return "<h1>Welcome Admin!</h1>";
	}
	
}
