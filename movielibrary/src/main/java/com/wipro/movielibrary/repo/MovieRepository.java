package com.wipro.movielibrary.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.movielibrary.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	 // Custom method to find a movie by its ID
    
    // Custom method for searching a movie by ID
    Optional<Movie> findById(Long id);

    // Custom method for searching movies by name (partial match, ignoring case)
    List<Movie> findByNameContainingIgnoreCase(String name);
    
    // Custom method for searching movies by collection range (greater than or equal to the given amount)
   
    // Custom method for searching movies by collection range (between minCollection and maxCollection)
    List<Movie> findByCollectionBetween(double minCollection, double maxCollection);
}

