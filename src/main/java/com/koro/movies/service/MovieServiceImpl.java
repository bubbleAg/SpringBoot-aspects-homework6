package com.koro.movies.service;

import com.koro.movies.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private List<Movie> movies;

    public MovieServiceImpl() {
        movies = new ArrayList<>();
        setDefaultMovies();
    }

    @Override
    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public boolean addMovie(Movie newMovie) {
        if (getMovieById(newMovie.getId()).isPresent()) {
            return false;
        }
        movies.add(newMovie);
        return true;
    }

    @Override
    public Optional<Movie> getMovieById(long id) {
        Optional<Movie> movie = movies.stream().filter(m -> m.getId() == id).findFirst();
        return movie;
    }

    private void setDefaultMovies() {
        movies.add(new Movie(1, "Spiderman", "Sam Raimi", 2002));
        movies.add(new Movie(2, "Avatar", "James Cameron", 2009));
        movies.add(new Movie(3, "Shrek", "Andrew Adamson", 2001));
    }
}
