package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sujata.bean.Rating;
import com.sujata.bean.Ratings;

@Service
public class RatingService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getFallBackRatings"/*,
			commandProperties={
					@HystrixProperty(name="execution.isolation.thread.timeoutInMillisecond",value="2000"),
					@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),
					@HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="50"),
					@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="5000"),
					
			}*/)
	public Ratings getRatings(String userId){
		return restTemplate.getForObject("http://RatingDataService/ratings/"+userId,Ratings.class);
	}
	
	public Ratings getFallBackRatings(String userId){
		List<Rating> ratingList=new ArrayList<>();
		ratingList.add(new Rating("R001", "M001", 4, userId));
		ratingList.add(new Rating("R002", "M002", 2, userId));
		ratingList.add(new Rating("R003", "M003", 5, userId));
		Ratings ratings=new Ratings();
		ratings.setRatings(ratingList);
		return ratings;
	}

}
