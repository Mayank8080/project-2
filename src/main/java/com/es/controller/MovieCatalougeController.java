package com.es.controller;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.es.dao.MovieDao;
import com.es.entity.Movie;
@RestController
@RequestMapping("/movies")
public class MovieCatalougeController {

	@Autowired
	private MovieDao movieDao;
	/*@RequestMapping(produces = "text/html")
public String testApi() {
	return "<font color=blue> Movie API works</font>";
}*/
	
	@RequestMapping(value="/sample",produces = "application/json" )
	public Movie sample() {
		Movie movie=new Movie(1111, "Jurasic World", "English", "Adventure");
		return movie;
	}
	@RequestMapping(value="/{movieId}",produces = {"application/json","application/xml"})
	public Movie searchById( @PathVariable("movieId") int id) {
		
		return movieDao.searchMovieById(id);
	}
	//@RequestMapping
	@GetMapping
	public List<Movie> allMovies(){
		System.out.println("listing all movies .....");
		return movieDao.listAllMovies();
	}
	//@RequestMapping(method = RequestMethod.POST,consumes = {"application/json","application/xml"},
		//	produces = "application/xml")
	@PostMapping(consumes = {"application/json","application/xml"},	produces = "application/json")
	public Movie addNewMovie(@RequestBody Movie m) {
		System.out.println("adding a new movie .....");
		return movieDao.addNewMovie(m);
	}
}
