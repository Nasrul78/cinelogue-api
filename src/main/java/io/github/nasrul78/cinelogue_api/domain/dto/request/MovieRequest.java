package io.github.nasrul78.cinelogue_api.domain.dto.request;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class MovieRequest {
    @NotBlank(message = "Title is required")
    @Size(max = 255)
    private String title;

    @Size(max = 255)
    private String director;

    @Min(1888)
    @Max(2100)
    private Integer releaseYear;

    @Size(max = 255)
    private String genre;

    @Min(0)
    @Max(100)
    private Integer rating;
}
