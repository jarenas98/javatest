package com.co.jarenas98.javatest.movies.data;

import com.co.jarenas98.javatest.movies.model.Genre;
import com.co.jarenas98.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(Integer id) {
        Object[] args = {id};

        return this.jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {

        return this.jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        this.jdbcTemplate.update("insert into movies(name, minutes, genre) values (?,?,?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }

    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre"))
            );
}
