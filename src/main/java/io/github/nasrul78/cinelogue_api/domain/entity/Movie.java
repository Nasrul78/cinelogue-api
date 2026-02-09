package io.github.nasrul78.cinelogue_api.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movies")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String director;
    
    @Column(name = "release_year")
    private Integer releaseYear;

    private String genre;

    private Integer rating;
}
