package com.sujata.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.bean.Item;
import com.sujata.service.ItemService;

@SpringBootApplication(scanBasePackages="com.sujata")
public class MyJdbcTemplateSpringBootProjectApplication implements CommandLineRunner {

	@Autowired
	ItemService itemService;
	
	public static void main(String[] args) {
		SpringApplication.run(MyJdbcTemplateSpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Item> items=itemService.getAllItems();
		System.out.println(items);
		
	}

}
