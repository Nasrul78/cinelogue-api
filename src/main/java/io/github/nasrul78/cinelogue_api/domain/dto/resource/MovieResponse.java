package io.github.nasrul78.cinelogue_api.domain.dto.resource;

import lombok.Data;

@Data
public class MovieResponse {
    private Long id;
    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    private Integer rating;
}
