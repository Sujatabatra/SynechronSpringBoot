package com.sujata.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Movie;
import com.sujata.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieResources {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId")String movieId){
		return movieService.searchMovie(movieId);
	}
}
