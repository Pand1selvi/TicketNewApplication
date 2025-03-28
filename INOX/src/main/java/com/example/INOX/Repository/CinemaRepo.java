package com.example.INOX.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.INOX.model.Cinema;
@Repository
public interface CinemaRepo  extends JpaRepository<Cinema, Long>{

}
