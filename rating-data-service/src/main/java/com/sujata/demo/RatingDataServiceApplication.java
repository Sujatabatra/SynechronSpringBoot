package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Rating;
import com.sujata.persistence.RatingRepository;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableJpaRepositories(basePackages="com.sujata.persistence")
@EntityScan(basePackages="com.sujata.bean")
@EnableEurekaClient
public class RatingDataServiceApplication/* implements CommandLineRunner*/ {

//	@Autowired
//	private RatingRepository rr;
	
	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		rr.save(new Rating("R001", "M002", 4, "U001"));
//		rr.save(new Rating("R002", "M003", 1, "U001"));
//		rr.save(new Rating("R003", "M001", 3, "U001"));
//		rr.save(new Rating("R004", "M004", 4, "U002"));
//		rr.save(new Rating("R005", "M003", 3, "U002"));
//		rr.save(new Rating("R006", "M004", 4, "U003"));
//		
//	}

}
