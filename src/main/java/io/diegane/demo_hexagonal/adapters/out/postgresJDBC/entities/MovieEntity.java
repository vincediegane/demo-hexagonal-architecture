package io.diegane.demo_hexagonal.adapters.out.postgresJDBC.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MovieEntity {
    @Id
    private Long id;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private String directorName;
}
