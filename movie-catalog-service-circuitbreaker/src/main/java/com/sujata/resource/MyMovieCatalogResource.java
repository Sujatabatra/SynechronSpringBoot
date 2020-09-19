package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.MovieDetailList;
import com.sujata.service.MovieCatalogService;


@RestController
@RequestMapping("/catalog")
public class MyMovieCatalogResource {

	@Autowired
	private MovieCatalogService movieCatalogService;
	
	@RequestMapping("/{userId}")
	public MovieDetailList getMovieData(@PathVariable("userId")String userId){
		return movieCatalogService.getMovieDetails(userId);
	}
}
