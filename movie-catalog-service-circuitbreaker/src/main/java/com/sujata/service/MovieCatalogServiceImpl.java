package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sujata.bean.Movie;
import com.sujata.bean.MovieDetailList;
import com.sujata.bean.MovieDetails;
import com.sujata.bean.Rating;
import com.sujata.bean.Ratings;
@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

//	@Autowired
//	RestTemplate restTemplate;
	@Autowired
	MovieService movieService;
	@Autowired
	RatingService ratingService;
	
	@Override
	public MovieDetailList getMovieDetails(String userId) {
		
		Ratings ratings=ratingService.getRatings(userId);
		
		MovieDetails movieDetails; 
		List<MovieDetails> movieDetailsList=new ArrayList<>();
		
		for(Rating rating:ratings.getRatings()){
			movieDetails=new MovieDetails();
			
			Movie movie=movieService.getMovie(rating.getMovieId());
					
			
			movieDetails.setMovieName(movie.getMovieName());
			movieDetails.setRating(rating.getRating());
			movieDetails.setUserId(rating.getUserId());
			
			movieDetailsList.add(movieDetails);
		}
		
		MovieDetailList movieDetailList1=new MovieDetailList();
		movieDetailList1.setMovieDetailsList(movieDetailsList);
		return movieDetailList1;
	}

	
	
	
//	public MovieDetailList getFallBackMovieDetails(String userId) {
//		List<MovieDetails> movieDetailsList= new ArrayList<>();
//		movieDetailsList.add(new MovieDetails("Movie Name Currently not Available",userId,4));
//		movieDetailsList.add(new MovieDetails("Movie Name Currently not Available",userId,3));
//		MovieDetailList mdList=new MovieDetailList();
//		mdList.setMovieDetailsList(movieDetailsList);
//		return mdList;
//	}
}
