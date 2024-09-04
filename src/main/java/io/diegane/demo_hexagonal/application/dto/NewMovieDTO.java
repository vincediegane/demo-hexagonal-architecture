package io.diegane.demo_hexagonal.application.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NewMovieDTO {
    private String title;
    private String description;
    private String directorName;
}
