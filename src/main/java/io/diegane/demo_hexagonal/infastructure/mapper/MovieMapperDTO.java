package io.diegane.demo_hexagonal.infastructure.mapper;

import io.diegane.demo_hexagonal.application.dto.NewMovieDTO;
import io.diegane.demo_hexagonal.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieMapperDTO {
    public Movie fromNewMovieDTO(NewMovieDTO newMovieDTO) {
        return Movie.builder()
            .title(newMovieDTO.getTitle())
            .description(newMovieDTO.getDescription())
            .directorName(newMovieDTO.getDirectorName())
        .build();
    }

    public NewMovieDTO fromMovie(Movie movie) {
        return NewMovieDTO.builder()
            .title(movie.getTitle())
            .description(movie.getDescription())
            .directorName(movie.getDirectorName())
        .build();
    }
}
