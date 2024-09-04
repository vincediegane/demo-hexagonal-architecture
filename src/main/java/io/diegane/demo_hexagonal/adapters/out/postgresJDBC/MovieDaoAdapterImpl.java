package io.diegane.demo_hexagonal.adapters.out.postgresJDBC;

import io.diegane.demo_hexagonal.adapters.out.postgresJDBC.mapper.MovieMapperEntity;
import io.diegane.demo_hexagonal.adapters.out.postgresJDBC.repositories.MovieRepository;
import io.diegane.demo_hexagonal.application.dao.MovieDao;
import io.diegane.demo_hexagonal.application.dto.NewMovieDTO;
import io.diegane.demo_hexagonal.domain.Movie;
import io.diegane.demo_hexagonal.infastructure.exceptions.MovieNotFoundException;
import io.diegane.demo_hexagonal.infastructure.mapper.MovieMapperDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDaoAdapterImpl implements MovieDao {

    private final MovieRepository movieRepository;
    private final MovieMapperEntity movieMapper;
    private  final MovieMapperDTO movieMapperToDto;

    public MovieDaoAdapterImpl(MovieRepository movieRepository, MovieMapperEntity movieMapper, MovieMapperDTO movieMapperToDto) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
        this.movieMapperToDto = movieMapperToDto;
    }

    @Override
    public Movie findMovieByTitle(String title) {
        return movieMapper.fromMovieEntity(movieRepository.findMovieByTitle(title).orElseThrow(() -> new MovieNotFoundException("Movie not found")));
    }

    @Override
    public Movie findById(Long id) {
        return movieMapper.fromMovieEntity(movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found")));
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll().stream().map(movieMapper::fromMovieEntity).toList();
    }

    @Override
    public Movie saveMovie(NewMovieDTO movieDTO) {
        Movie movie = movieMapperToDto.fromNewMovieDTO(movieDTO);
        return movieMapper.fromMovieEntity(movieRepository.save(movieMapper.fromMovie(movie)));
    }

    @Override
    public Movie updateMovie(Long id) {
        return null;
    }

    @Override
    public void deleteMovie(Long id) {

    }
}
