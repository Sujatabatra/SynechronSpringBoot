package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;
import com.sujata.bean.MovieDetailList;
import com.sujata.bean.MovieDetails;
import com.sujata.bean.Rating;
import com.sujata.bean.Ratings;
@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public MovieDetailList getMovieDetails(String userId) {
		
		Ratings ratings=restTemplate.getForObject("http://RatingDataService/ratings/"+userId,Ratings.class);
		
		MovieDetails movieDetails; 
		List<MovieDetails> movieDetailsList=new ArrayList<>();
		
		for(Rating rating:ratings.getRatings()){
			movieDetails=new MovieDetails();
			
			Movie movie=restTemplate.getForObject("http://MovieInfoService/movies/"+rating.getMovieId(), Movie.class);
			
			movieDetails.setMovieName(movie.getMovieName());
			movieDetails.setRating(rating.getRating());
			movieDetails.setUserId(rating.getUserId());
			
			movieDetailsList.add(movieDetails);
		}
		
		MovieDetailList movieDetailList1=new MovieDetailList();
		movieDetailList1.setMovieDetailsList(movieDetailsList);
		return movieDetailList1;
	}

}
