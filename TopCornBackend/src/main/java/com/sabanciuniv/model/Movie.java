package com.sabanciuniv.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {
	@Id
	private String id;
	private String name;
	private String imagePath;
	private float totalRating;
	private String description;
	
	
	private String theme;
	
	@DBRef
	private List<Comment> comments = new ArrayList<>();
	
	
	public Movie() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public float gettotalRating() {
		return totalRating;
	}
	public void setTotalRating(float totalRating) {
		this.totalRating = totalRating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Movie(String name, String imagePath, float totalRating, String description, String theme) {
		super();
		this.name = name;
		this.imagePath = imagePath;
		this.totalRating = totalRating;
		this.description = description;
		this.theme = theme;
	}
	
}
