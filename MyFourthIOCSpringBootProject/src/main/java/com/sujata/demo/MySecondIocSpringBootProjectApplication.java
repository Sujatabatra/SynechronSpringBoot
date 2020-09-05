package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.training.Performer;
import com.sujata.training.Singer;

@SpringBootApplication()
public class MySecondIocSpringBootProjectApplication {

	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MySecondIocSpringBootProjectApplication.class, args);
		
//		Auditorium auditorium=(Auditorium)ctx.getBean("auditorium");
//		
//		auditorium.performance();
		
		Performer p1=(Performer)ctx.getBean("xxx");
		p1.perform();
		
//		Performer p2=(Performer)ctx.getBean("sonu");
//		p2.perform();
//		
//		System.out.println("p1 : "+p1.hashCode());
//		System.out.println("p2 : "+p2.hashCode());
		
		
	}

}
