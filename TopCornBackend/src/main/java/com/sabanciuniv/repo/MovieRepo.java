package com.sabanciuniv.repo;





import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Movie;



public interface MovieRepo extends MongoRepository<Movie, String>{
	
	Movie findByName(String name);
	
	
	
	

	 
}
