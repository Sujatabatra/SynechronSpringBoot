package com.sujata.service;

import com.sujata.bean.MovieDetailList;
import com.sujata.bean.MovieDetails;

public interface MovieCatalogService {

	public MovieDetailList getMovieDetails(String userId);
}
