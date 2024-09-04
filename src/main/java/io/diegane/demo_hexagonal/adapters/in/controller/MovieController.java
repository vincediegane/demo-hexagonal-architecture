package io.diegane.demo_hexagonal.adapters.in.controller;

import io.diegane.demo_hexagonal.application.useCases.MovieUseCase;
import io.diegane.demo_hexagonal.domain.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieUseCase movieUseCase;

    public MovieController(MovieUseCase movieUseCase) {
        this.movieUseCase = movieUseCase;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieUseCase.findAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(movieUseCase.findById(id));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Movie> getMovieByTitle(@PathVariable String title) {
        return null;
    }
}
