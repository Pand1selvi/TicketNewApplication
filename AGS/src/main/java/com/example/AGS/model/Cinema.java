package com.example.AGS.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cinema {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Long getId() {
		return id;
	}
	public Cinema() {
		super();
	}
	public Cinema(Long id, String name, String location, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.movies = movies;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	private String location;
	
	// @JsonManagedReference
    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    private List<Movie> movies;
   
}
