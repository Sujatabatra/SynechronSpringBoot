 package com.sujata.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class MovieCatalogServiceApplication/* implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
//		HttpComponentsClientHttpRequestFactory httpRequestFactory=new HttpComponentsClientHttpRequestFactory();
//		httpRequestFactory.setConnectTimeout(3000);
//		return new RestTemplate(httpRequestFactory);
		//if getting the response in 3000 ms gr8 otherwise throw error
	}
	
//	@Autowired
//	DiscoveryClient discoveryClient;

//	@Override
//	public void run(String... args) throws Exception {
//		List<ServiceInstance> instances=discoveryClient.getInstances("MovieInfoService");
//		System.out.println(instances.toString());
//		System.out.println(instances.get(0).getUri().toString());
//		String serviceUri=instances.get(0).getUri().toString()+"/movies/M001";
//		System.out.println(serviceUri);
//		RestTemplate rt=new RestTemplate();
//		
//		Movie movie=rt.getForObject(serviceUri, Movie.class);
//		System.out.println(movie.getMovieId()+" "+movie.getMovieName());
//		
//		
//	}
	

	
	
}
