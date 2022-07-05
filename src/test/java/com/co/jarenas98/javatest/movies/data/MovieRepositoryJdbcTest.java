package com.co.jarenas98.javatest.movies.data;

import com.co.jarenas98.javatest.movies.model.Genre;
import com.co.jarenas98.javatest.movies.model.Movie;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class MovieRepositoryJdbcTest {

    private MovieRepositoryJdbc movieRepositoryJdbc;

    private DataSource dataSource;

    @Before
    public void setUp() throws SQLException {

        this.dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "test", "test");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        this.movieRepositoryJdbc = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void load_all_movies() {
        Collection<Movie> movies = this.movieRepositoryJdbc.findAll();
        assertEquals(Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "Matrix", 136, Genre.ACTION)
                ),
                movies
        );
    }

    @Test
    public void load_movie_by_id() {
        Movie movie = this.movieRepositoryJdbc.findById(2);

        assertEquals(new Movie(2, "Memento", 113, Genre.THRILLER), movie);
    }

    @Test
    public void insert_a_movie() {

        Movie movieExpected = new Movie("Super 8", 112, Genre.THRILLER);

        this.movieRepositoryJdbc.saveOrUpdate(movieExpected);

        Movie movie = this.movieRepositoryJdbc.findById(4);

        assertEquals(new Movie(4, "Super 8", 112, Genre.THRILLER), movie);
    }

    @After
    public void tearDown() throws SQLException {
        final Statement s = this.dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}