package com.wipro.movielibrary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.movielibrary.entity.Movie;
import com.wipro.movielibrary.service.MovieService;


@Controller
public class UserController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/searchByid")
    public String getsearchById() {
        return "searchById";
    }

    @PostMapping("/searchpost")
    public String postsearchById(@RequestParam("id") Long id, Model model) {
        Movie movie = movieService.searchMovieById(id);
        System.out.println("posting");
        System.out.println(movie);

        if (movie != null) {
            model.addAttribute("movie", movie);
            return "searchResultsById"; // Assuming "insert.jsp" is the JSP view to display the search results
        } else {
            // Set the custom error message for the error page
            model.addAttribute("errorMsg", "No movies found for the given ID.");
            return "errorPage"; // Return to the custom error page
        }
    }

    @GetMapping("/errorPage")
    public String showErrorPage() {
        return "errorPage";
    }
    
    @GetMapping("/searchByname")
    public String getsearchByName() {
        return "searchByName"; // Assuming "searchByName.jsp" is the JSP view for searching by movie name
    }
    
    @PostMapping("/searchByNameResult")
    public String postSearchByName(@RequestParam("movieName") String movieName, Model model) {
        List<Movie> movies = movieService.searchMoviesByName(movieName);
        System.out.println(movies);
        if (!movies.isEmpty()) {
            model.addAttribute("movies", movies);
            model.addAttribute("searchValue", movieName);
            return "searchResultsByName"; // Assuming "searchResultsByName.jsp" is the JSP view to display the search results
        } else {
            model.addAttribute("errorMsg", "No movies found for the given movie name.");
            return "errorPage"; // Return to the custom error page
        }
    }
    
    @GetMapping("/searchByCollectionRange")
    public String getSearchByCollectionRange() {
        return "searchByCollectionRange"; // Assuming "searchByCollectionRange.jsp" is the JSP view for searching by collection range
    }
    
    @PostMapping("/searchByCollectionResult")
    public String postSearchByCollection(@RequestParam("minCollection") double minCollection,
                                         @RequestParam("maxCollection") double maxCollection, Model model) {
        List<Movie> movies = movieService.searchMoviesByCollectionRange(minCollection, maxCollection);

        if (!movies.isEmpty()) {
            model.addAttribute("movies", movies);
            model.addAttribute("minCollection", minCollection);
            model.addAttribute("maxCollection", maxCollection);
            return "searchResultsByCollection"; // Assuming "searchResultsByCollection.jsp" is the JSP view to display the search results
        } else {
            model.addAttribute("errorMsg", "No movies found in the given collection range.");
            return "errorPage"; // Return to the custom error page
        }
    }
    	

}


