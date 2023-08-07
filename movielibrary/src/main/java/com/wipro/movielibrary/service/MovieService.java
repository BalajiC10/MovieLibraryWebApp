package com.wipro.movielibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.movielibrary.entity.Movie;
import com.wipro.movielibrary.repo.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // Other methods...

    // Method for searching a movie by ID
    public Movie searchMovieById(Long id) {
        Optional<Movie> movieOptional = movieRepository.findById(id);
        return movieOptional.orElse(null);
    }
    // Method for searching movies by name (partial match, ignoring case)
    public List<Movie> searchMoviesByName(String name) {
        return movieRepository.findByNameContainingIgnoreCase(name);
    }
    

    public List<Movie> searchMoviesByCollectionRange(double minCollection, double maxCollection) {
        return movieRepository.findByCollectionBetween(minCollection, maxCollection);
    }
 
}

