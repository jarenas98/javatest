package com.co.jarenas98.javatest.movies.service;

import com.co.jarenas98.javatest.movies.data.MovieRepository;
import com.co.jarenas98.javatest.movies.model.Genre;
import com.co.jarenas98.javatest.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {

    private MovieService movieService;
    private MovieRepository movieRepository;

    @Before
    public void setup() {
        this.movieRepository = Mockito.mock(MovieRepository.class);
        this.movieService = new MovieService(movieRepository);
        Mockito.when(this.movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );
    }

    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = this.movieService.findMoviesByGenre(Genre.COMEDY);

        assertEquals(Arrays.asList(3, 6), getIdOfMovies(movies));
    }

    @Test
    public void return_movies_by_duration() {
        Collection<Movie> movies = this.movieService.findMoviesByDuration(119);

        assertEquals(Arrays.asList(2, 3, 4, 5, 6), getIdOfMovies(movies));
    }

    private List<Integer> getIdOfMovies(Collection<Movie> movies) {
        List<Integer> moviesIds = movies.stream().map(Movie::getId).collect(Collectors.toList());

        return moviesIds;
    }

}