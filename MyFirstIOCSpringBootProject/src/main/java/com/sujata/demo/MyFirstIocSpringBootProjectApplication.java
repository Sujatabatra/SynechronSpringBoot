package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()
public class MyFirstIocSpringBootProjectApplication /*implements CommandLineRunner*/ {

//	@Autowired
//	Greet greet;
	
	public static void main(String[] args) {
		ApplicationContext iocContainer= SpringApplication.run(MyFirstIocSpringBootProjectApplication.class, args);
		
		Greet greet=(Greet)iocContainer.getBean("gm");
		greet.wish("Sujata");
		
		System.out.println(greet.hashCode());
		
		Greet greet1=(Greet)iocContainer.getBean("gm");
		greet1.wish("Batra");
		System.out.println(greet1.hashCode());
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		greet.wish("Sujata");
//		
//	}

}
