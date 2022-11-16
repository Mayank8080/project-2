package com.es.dao;


import java.util.List;

import com.es.entity.Movie;

public interface MovieDao {
 Movie searchMovieById(int id);
 List<Movie> listAllMovies();
 Movie addNewMovie(Movie m);
 void removeMovie(int id);
 Movie updateMovie(Movie m);
 List<Movie> searchByLanguages(String lang);
 List<Movie> searchByGenre(String genre);
 List<Movie> searchByName(String name);

}
