package com.es.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.es.entity.Movie;
@Component
public class MovieDaoImpl implements MovieDao {
	@PersistenceContext
	private EntityManager em;
	
	
	List<Movie> movieList= new ArrayList<>();
	{ //Assume these data pulled from DB
		Movie m1=new Movie(111,"Spider Man","English","Action");
		Movie m2=new Movie(112,"Jurasic Park","English","Adventure");
		Movie m3=new Movie(113,"Inception","English","Sci-Fi");
		Movie m4=new Movie(114,"Fast and Furious","English","Action");
		Movie m5=new Movie(115,"Civil War","English","Action");
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
	}
	
	@Override
	public Movie searchMovieById(int id) {
		for(Movie m:movieList) {
			if(m.getMovieCode()==id)
				return m;
		}
		return null;
	}

	@Override
	public List<Movie> listAllMovies() {
		// TODO Auto-generated method stub
		return movieList;
	}
	@Override
	@Transactional
	public Movie addNewMovie(Movie m) {
		//em.persist(m);
		 movieList.add(m);
		 return m;
	}

	@Override
	public void removeMovie(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movie updateMovie(Movie m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> searchByLanguages(String lang) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> searchByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
