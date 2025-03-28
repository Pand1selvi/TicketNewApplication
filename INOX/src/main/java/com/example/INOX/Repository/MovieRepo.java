package com.example.INOX.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.INOX.model.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
