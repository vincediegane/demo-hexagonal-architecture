package io.diegane.demo_hexagonal.application.dao;

import io.diegane.demo_hexagonal.application.dto.NewMovieDTO;
import io.diegane.demo_hexagonal.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    Movie findMovieByTitle(String title);
    Movie findById(Long id);
    List<Movie> findAllMovies();
    Movie saveMovie(NewMovieDTO movieDTO);
    Movie updateMovie(Long id);
    void deleteMovie(Long id);
}
