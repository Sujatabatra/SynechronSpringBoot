package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Item;

@SpringBootApplication(scanBasePackages="com.sujata")
@EntityScan(basePackages="com.sujata.bean")
@EnableJpaRepositories(basePackages="com.sujata.persistance")
public class MySpringBootRestProjectApplication implements CommandLineRunner {

	@Autowired
	private RestTemplate restTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootRestProjectApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Override
	public void run(String... args) throws Exception {
		String obj=restTemplate.getForObject("http://localhost:8086/items",String.class );
		System.out.println(obj);
		
	
		
	}

}
