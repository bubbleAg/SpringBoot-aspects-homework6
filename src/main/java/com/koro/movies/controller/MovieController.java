package com.koro.movies.controller;

import com.koro.movies.annotation.SendMail;
import com.koro.movies.model.Movie;
import com.koro.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public ResponseEntity getMovies() {
        return new ResponseEntity(movieService.getMovies(), HttpStatus.OK);
    }

    @PostMapping("/add")
    @SendMail
    public ResponseEntity addMovie(@RequestBody Movie newMovie) {
        if(movieService.addMovie(newMovie)) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.CONFLICT);
    }

}
