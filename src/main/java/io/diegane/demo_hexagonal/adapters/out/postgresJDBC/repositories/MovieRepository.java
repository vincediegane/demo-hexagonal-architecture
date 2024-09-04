package io.diegane.demo_hexagonal.adapters.out.postgresJDBC.repositories;

import io.diegane.demo_hexagonal.adapters.out.postgresJDBC.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    @Query("SELECT m FROM MovieEntity m WHERE m.title = :title")
    Optional<MovieEntity> findMovieByTitle(String title);
}
