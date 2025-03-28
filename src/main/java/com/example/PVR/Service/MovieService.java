package com.example.PVR.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PVR.model.Movie;
import com.example.PVR.repository.MovieRepo;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepository;
    
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
//{
//"title": "Kantara",
//"genre": "Action/Drama",
//"duration": "150 min",
//"rating": "U",
//"cinema": { "id": 2 },
//"showtimes": ["2025-03-16T12:00:00", "2025-03-16T16:00:00"]
//}