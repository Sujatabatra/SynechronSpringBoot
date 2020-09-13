package com.sujata.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {
	
	@RequestMapping("/welcome")
	public String greet(){
		return " Hello from very first Eureka client!!";
	}

}
