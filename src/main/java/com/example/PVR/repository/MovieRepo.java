package com.example.PVR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PVR.model.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {

}
