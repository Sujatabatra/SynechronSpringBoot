package com.sujata.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Item;
import com.sujata.service.ItemService;

@SpringBootApplication(scanBasePackages="com.sujata")
@EntityScan(basePackages="com.sujata.bean")
@EnableJpaRepositories(basePackages="com.sujata.persistance")
public class MyJpaSpringBootProjectApplication implements CommandLineRunner {

	@Autowired
	private ItemService itemService;
	public static void main(String[] args) {
		SpringApplication.run(MyJpaSpringBootProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		List<Item> items=itemService.getAllItems();
		System.out.println(items);
	}

}
