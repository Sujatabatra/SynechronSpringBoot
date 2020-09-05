package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.training.Performer;

@SpringBootApplication(scanBasePackages={"com.sujata.training","com.sujata.demo"})
public class MySecondIocSpringBootProjectApplication {

	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MySecondIocSpringBootProjectApplication.class, args);
		
		Performer p1=(Performer)ctx.getBean("Hari");
		
		p1.perform();
		
		
	}

}
