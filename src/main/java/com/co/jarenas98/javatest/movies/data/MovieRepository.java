package com.co.jarenas98.javatest.movies.data;

import com.co.jarenas98.javatest.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(Integer id);

    Collection<Movie> findAll();

    void saveOrUpdate(Movie movie);
}
