package io.diegane.demo_hexagonal.adapters.out.postgresJDBC.mapper;

import io.diegane.demo_hexagonal.adapters.out.postgresJDBC.entities.MovieEntity;
import io.diegane.demo_hexagonal.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieMapperEntity {
    public Movie fromMovieEntity(MovieEntity movieEntity) {
        return Movie.builder()
            .id(movieEntity.getId())
            .title(movieEntity.getTitle())
            .description(movieEntity.getDescription())
            .releaseDate(movieEntity.getReleaseDate())
            .directorName(movieEntity.getDirectorName())
        .build();
    }

    public MovieEntity fromMovie(Movie movie) {
        return MovieEntity.builder()
            .id(movie.getId())
            .title(movie.getTitle())
            .description(movie.getDescription())
            .releaseDate(movie.getReleaseDate())
            .directorName(movie.getDirectorName())
        .build();
    }
}
