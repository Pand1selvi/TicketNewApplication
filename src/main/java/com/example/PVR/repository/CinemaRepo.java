package com.example.PVR.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PVR.model.Cinema;
@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Long>{

	

}
