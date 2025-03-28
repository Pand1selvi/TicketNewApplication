package com.example.AGS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AGS.Service.CinemaService;
import com.example.AGS.model.Cinema;

@RestController
@RequestMapping("/api/v1")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;
  
    
    @GetMapping("/cinemas")
    public List<Cinema> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }
}
