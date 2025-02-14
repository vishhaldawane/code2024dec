package com.example.demo.vo;

import com.example.demo.entity.Movie;

public class CinemaTemplate {
	private Director director;
	private Movie movie;
	
	// Getters & Setters
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}
