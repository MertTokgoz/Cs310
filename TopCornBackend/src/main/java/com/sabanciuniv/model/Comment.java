package com.sabanciuniv.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {
	@Id
	private String id;
	private String review;
	private float rating;
	private String username;
	
	
	
	
	public Comment() {
		super();
	}
	public Comment( String review, float rating, String username) {
		super();
		this.review = review;
		this.rating = rating;
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	
}
