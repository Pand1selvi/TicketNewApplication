package com.example.INOX.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema;

    private Long userId; // Assuming a user system exists

    private LocalDateTime showtime;
    
    private int seats;

    // Constructors
    public Booking() {}

    public Booking(Movie movie, Cinema cinema, Long userId, LocalDateTime showtime, int seats) {
        this.movie = movie;
        this.cinema = cinema;
        this.userId = userId;
        this.showtime = showtime;
        this.seats = seats;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }

    public Cinema getCinema() { return cinema; }
    public void setCinema(Cinema cinema) { this.cinema = cinema; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public LocalDateTime getShowtime() { return showtime; }
    public void setShowtime(LocalDateTime showtime) { this.showtime = showtime; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }
}

