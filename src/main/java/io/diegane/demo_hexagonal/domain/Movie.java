package io.diegane.demo_hexagonal.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Movie {
    private Long id;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private String directorName;
}
