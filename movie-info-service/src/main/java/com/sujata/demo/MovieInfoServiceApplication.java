package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Movie;
import com.sujata.persistence.MovieRepository;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableJpaRepositories(basePackages="com.sujata.persistence")
@EntityScan(basePackages="com.sujata.bean")
@EnableEurekaClient
public class MovieInfoServiceApplication/* implements CommandLineRunner*/{

//	@Autowired
//	MovieRepository mr;
	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		mr.save(new Movie("M001", "Black and White"));
//		mr.save(new Movie("M002", "Bahu Bali"));
//		mr.save(new Movie("M003", "Titanic"));
//		mr.save(new Movie("M004", "Three Idiots"));
//		
//	}

}
