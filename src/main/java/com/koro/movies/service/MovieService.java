package com.koro.movies.service;

import com.koro.movies.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<Movie> getMovies();
    boolean addMovie(Movie newMovie);
    Optional<Movie> getMovieById(long id);
}
