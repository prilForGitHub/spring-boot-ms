package com.psl.ratingdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.ratingdataservice.models.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

		@RequestMapping("/{movieId}")
		public Rating getRAting(@PathVariable("movieId") String movieId){
		
			return new Rating(movieId, 5);
		}
}
