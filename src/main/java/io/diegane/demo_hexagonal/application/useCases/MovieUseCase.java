package io.diegane.demo_hexagonal.application.useCases;

import io.diegane.demo_hexagonal.application.dao.MovieDao;
import io.diegane.demo_hexagonal.application.dto.NewMovieDTO;
import io.diegane.demo_hexagonal.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieUseCase {
    private final MovieDao movieDao;

    public Movie saveMovie(NewMovieDTO movieDTO) {
        return movieDao.saveMovie(movieDTO);
    }

    public List<Movie> findAllMovies() {
        return movieDao.findAllMovies();
    }

    public Movie findById(Long id) {
        return movieDao.findById(id);
    }
}
