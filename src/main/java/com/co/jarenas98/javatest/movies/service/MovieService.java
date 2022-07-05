package com.co.jarenas98.javatest.movies.service;

import com.co.jarenas98.javatest.movies.data.MovieRepository;
import com.co.jarenas98.javatest.movies.model.Genre;
import com.co.jarenas98.javatest.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return this.movieRepository.findAll()
                .stream().filter(movie -> movie.getGenre() == genre)
                .collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByDuration(int duration) {
        return this.movieRepository.findAll()
                .stream().filter(movie -> movie.getMinutes() <= duration)
                .collect(Collectors.toList());
    }
}
