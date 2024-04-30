package com.sabanciuniv.service;





import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabanciuniv.model.Comment;
import com.sabanciuniv.model.Movie;
import com.sabanciuniv.model.Theme;
import com.sabanciuniv.repo.CommentRepo;
import com.sabanciuniv.repo.MovieRepo;
import com.sabanciuniv.repo.ThemeRepo;

import jakarta.annotation.PostConstruct;




@Service
public class AppService {
	@Autowired MovieRepo movRepo;
	@Autowired ThemeRepo theRepo;
	@Autowired CommentRepo comRepo;
	
	Logger logger = LoggerFactory.getLogger(AppService.class);
	
	@PostConstruct
	public void init() {
		if(theRepo.count()==0) {
			logger.info("Data set is empty, inserting data");
			Comment com1 = new Comment("great", 5, "Mert");
			Movie mov1 = new Movie("Aftersun", "aftersun.jpg", (float) 4.5, "Story about a summer vacation", "Drama");
			Theme the1 = new Theme( "Drama");
			mov1.getComments().add(com1);
			the1.getMovies().add(mov1);
			
			Comment com2 = new Comment("wow", 3, "Fadime");
			Movie mov2 = new Movie("Batman", "batmaN.jpg", (float) 4.5, "Story about a summer vacation", "Action");
			Theme the2 = new Theme( "Action");
			mov2.getComments().add(com2);
			the2.getMovies().add(mov2);
			
			
			Comment com3 = new Comment("great", 5, "Mert");
			Movie mov3 = new Movie("Recep Ivedik", "recepivedik.jpg", (float) 5, "Story about a summer vacation", "Comedy");
			Theme the3 = new Theme( "Comedy");
			mov3.getComments().add(com3);
			the3.getMovies().add(mov3);
			
			
			comRepo.save(com1);
			movRepo.save(mov1);
			theRepo.save(the1);
			comRepo.save(com2);
			movRepo.save(mov2);
			theRepo.save(the2);
			comRepo.save(com3);
			movRepo.save(mov3);
			theRepo.save(the3);
			logger.info("Data insertion is completed");
			
		}
		
	}
	
	
	
	
		public void addComment(String movieName, String review, float rating, String username) {
			Comment com = new Comment(review, rating,username );
			comRepo.save(com);
			Movie mov = movRepo.findByName(movieName);
			mov.getComments().add(com);
			mov.setTotalRating(mov.gettotalRating() + rating);
			movRepo.save(mov);
		}
		public void addMovie(String themeName, String movieName, String imagePath, String description) {
			//String name, String imagePath, float totalRating, String description, String theme
			Movie mov = new Movie(movieName, imagePath, 0, description, themeName);
			movRepo.save(mov);
			Theme theme = theRepo.findByName(themeName);
			theme.getMovies().add(mov);
			theRepo.save(theme);
		}
		
		public void printAllMovies(String theme) {
			for (Movie movie : theRepo.findByName(theme).getMovies()) {
				logger.info(movie.getName());
			}
			
			
		}
		
	
	
			
	
}
