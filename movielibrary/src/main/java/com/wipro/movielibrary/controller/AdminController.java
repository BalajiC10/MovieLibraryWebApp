package com.wipro.movielibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.movielibrary.entity.Movie;
import com.wipro.movielibrary.service.AdminService;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/adminLogin")
    public String showAdminLoginPage() {
        return "adminLogin"; // Assuming "adminLogin.jsp" is the JSP view for the admin login page
    }

    @PostMapping("/adminLoginSubmit")
    public String adminLoginSubmit(@RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   Model model) {
        if (adminService.validateAdminCredentials(username, password)) {
            return "adminDashboard"; // Assuming "adminDashboard.jsp" is the JSP view for the admin dashboard
        } else {
            model.addAttribute("errorMsg", "Invalid credentials. Please check your username and password.");
            return "adminLoginError"; // Assuming "adminLoginError.jsp" is the JSP view for the error message
        }
    }
    @GetMapping("/adminDashboard")
    public String showAdminDashboard() {
        return "adminDashboard"; // Assuming "adminDashboard.jsp" is the JSP view for the admin dashboard
    }
    @GetMapping("/addMovie")
    public String showAddMoviePage() {
        return "addMovie"; // Assuming "addMovie.jsp" is the JSP view to display the form for adding a movie
    }

    @PostMapping("/addMovie")
    public String addMovie(@RequestParam("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("collection") double collection,
                           Model model) {
        Movie movie = adminService.addMovie(id, name, collection);
        System.out.println(movie);
        if (movie != null) {
            model.addAttribute("successMsg", "Movie added successfully!");
            return "addMovieSuccess"; // Assuming "addMovieSuccess.jsp" is the JSP view for the success message
        } else {
            model.addAttribute("errorMsg", "Movie with the given ID already exists.");
            return "addMovieError"; // Assuming "addMovieError.jsp" is the JSP view for the error message
        }
    }

    @GetMapping("/viewAllMovies")
    public String viewAllMovies(Model model) {
        List<Movie> allMovies = adminService.getAllMovies();
        model.addAttribute("movies", allMovies);
        return "viewAllMovies"; // Assuming "viewAllMovies.jsp" is the JSP view to display all movies
    }
    @GetMapping("/modifyMovie")
    public String showModifyMoviePage() {
        return "modifyMovie"; // Assuming "modifyMovie.jsp" is the JSP view for the modify movie page (functionality in progress)
    }

    
}
