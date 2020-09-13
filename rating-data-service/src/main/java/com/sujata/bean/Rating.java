package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {

	@Id
	private String ratingId;
	private String movieId;
	private int rating;
	private String userId;
	
	public Rating(){
		
	}

	public Rating(String ratingId, String movieId, int rating, String userId) {
		super();
		this.ratingId = ratingId;
		this.movieId = movieId;
		this.rating = rating;
		this.userId = userId;
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}