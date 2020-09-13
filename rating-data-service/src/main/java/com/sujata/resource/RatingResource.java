package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Rating;
import com.sujata.bean.Ratings;
import com.sujata.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@Autowired
	private RatingService ratingService;
	
	@RequestMapping("/{userID}")
	public Ratings getRatings(@PathVariable("userID") String userId){
		return ratingService.getRating(userId);
	}

}
