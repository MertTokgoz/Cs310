package com.sabanciuniv.repo;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Comment;




public interface CommentRepo extends MongoRepository<Comment, String> {
	
	
	
	
}
