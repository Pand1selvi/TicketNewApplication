package com.example.PVR.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String duration;
    private String rating;
    
  //  @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @ElementCollection
    private List<String> showtimes;


    public Long getId() {
		return id;
	}

	public Movie() {
		super();
	}

	public Movie(Long id, String title, String genre, String duration, String rating, Cinema cinema,
			List<String> showtimes) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
		this.cinema = cinema;
		this.showtimes = showtimes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public List<String> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(List<String> showtimes) {
		this.showtimes = showtimes;
	}

	
    
}

	


