package com.example.PVR.Controller;

import com.example.PVR.Service.MovieService;
import com.example.PVR.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    @Autowired
    private MovieService movieService;
    
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
    
    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
}