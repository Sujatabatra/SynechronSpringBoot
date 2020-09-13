package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Rating;
import com.sujata.bean.Ratings;
import com.sujata.persistence.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService  {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Ratings getRating(String userId) {
		Ratings ratings=new Ratings();
		List<Rating> ratingList=ratingRepository.findByUserId(userId);
		ratings.setRatings(ratingList);
		return ratings;
	}

}
