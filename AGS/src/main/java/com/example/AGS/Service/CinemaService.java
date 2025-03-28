package com.example.AGS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AGS.Repository.CinemaRepo;
import com.example.AGS.model.Cinema;

@Service
public class CinemaService {
	@Autowired
CinemaRepo cinemaRepository;

    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }
}
