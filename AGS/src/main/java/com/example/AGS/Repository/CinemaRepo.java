package com.example.AGS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AGS.model.Cinema;

@Repository
public interface CinemaRepo  extends JpaRepository<Cinema, Long>{
	

}
