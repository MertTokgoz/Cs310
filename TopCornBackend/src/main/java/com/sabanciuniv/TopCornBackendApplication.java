package com.sabanciuniv;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactory;

import com.mongodb.client.model.search.TotalSearchCount;
import com.sabanciuniv.model.Comment;
import com.sabanciuniv.model.Movie;
import com.sabanciuniv.model.Theme;
import com.sabanciuniv.repo.CommentRepo;
import com.sabanciuniv.repo.MovieRepo;
import com.sabanciuniv.repo.ThemeRepo;
import com.sabanciuniv.service.AppService;



@SpringBootApplication
public class TopCornBackendApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(TopCornBackendApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TopCornBackendApplication.class, args);
	}
	
	
	@Autowired CommentRepo comRepo;
	@Autowired MovieRepo movRepo;
	@Autowired ThemeRepo themeRepo;
	@Autowired AppService appService;
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("Welcome to the TopCorn");
		
		appService.addComment("Recep Ivedik", "Agladim", 5, "Berke");
		appService.addMovie("Comedy", "Hababam Sinifi Askerde", "hababam.jpeg", "Tsk");	
	}
}
