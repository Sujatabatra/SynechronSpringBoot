package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeServices {

	@Autowired
	RestTemplate restTemplate;
	
	public String myFunction(){
		return restTemplate.getForObject("http://localhost:8086/items", String.class);
	}
}
