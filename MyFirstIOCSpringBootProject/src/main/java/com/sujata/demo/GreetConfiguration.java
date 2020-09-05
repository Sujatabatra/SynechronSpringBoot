package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfiguration {

	@Bean(name="gm")
	public Greet getGoodMorining(){
		return new GoodMorning();
	}
}
