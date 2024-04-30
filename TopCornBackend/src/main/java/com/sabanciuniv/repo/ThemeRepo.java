package com.sabanciuniv.repo;




import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.sabanciuniv.model.Theme;
public interface ThemeRepo extends MongoRepository<Theme, String>{

	public Theme findByName(String name);
	
	
}
