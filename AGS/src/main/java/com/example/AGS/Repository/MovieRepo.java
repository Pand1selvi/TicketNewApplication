package com.example.AGS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AGS.model.Movie;

@Repository
public interface MovieRepo  extends JpaRepository<Movie, Long>{

}
