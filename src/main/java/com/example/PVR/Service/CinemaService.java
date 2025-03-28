package com.example.PVR.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PVR.model.Cinema;
import com.example.PVR.repository.CinemaRepo;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepo cinemaRepository;
    
    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }
}