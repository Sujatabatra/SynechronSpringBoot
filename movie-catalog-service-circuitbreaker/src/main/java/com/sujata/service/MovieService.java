package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sujata.bean.Movie;

@Service
public class MovieService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getFallBackMovie"/*,
			threadPoolKey="movieInfoPool",
			threadPoolProperties={
					@HystrixProperty(name="coreSize",value="20"),
					@HystrixProperty(name="maxQueueSize",value="10")
			}*/)
	public Movie getMovie(String movieId){
		return restTemplate.getForObject("http://MovieInfoService/movies/"+movieId, Movie.class);
	}
	
	public Movie getFallBackMovie(String movieId){
		return new Movie(movieId,"Unavailable");
	}

}
