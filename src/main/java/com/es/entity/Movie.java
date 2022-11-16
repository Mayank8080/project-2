package com.es.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Movie {
	@Id
private int movieCode;
private String movieName;
private String language;
private String genre;
public Movie() {
	// TODO Auto-generated constructor stub
}
public Movie(int movieCode, String movieName, String language, String genre) {
	super();
	this.movieCode = movieCode;
	this.movieName = movieName;
	this.language = language;
	this.genre = genre;
}

public int getMovieCode() {
	return movieCode;
}
public void setMovieCode(int movieCode) {
	this.movieCode = movieCode;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}


}
