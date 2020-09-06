package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.persistence.ItemDaoImpl;
import com.sujata.service.ItemServiceImpl;

@Configuration
public class MyConfig {

	@Bean
	public ItemDaoImpl itemDaoImpl(){
		return new ItemDaoImpl();
	}
	
	@Bean 
	public ItemServiceImpl itemServiceImpl(){
		return new ItemServiceImpl();
	}
}
