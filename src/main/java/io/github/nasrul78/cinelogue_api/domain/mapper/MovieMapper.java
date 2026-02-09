package io.github.nasrul78.cinelogue_api.domain.mapper;

import org.springframework.stereotype.Component;

import io.github.nasrul78.cinelogue_api.domain.dto.request.MovieRequest;
import io.github.nasrul78.cinelogue_api.domain.dto.resource.MovieResponse;
import io.github.nasrul78.cinelogue_api.domain.entity.Movie;

@Component
public class MovieMapper {
    public Movie toEntity(MovieRequest request) {
        Movie movie = new Movie();
        movie.setTitle(request.getTitle());
        movie.setDirector(request.getDirector());
        movie.setReleaseYear(request.getReleaseYear());
        movie.setGenre(request.getGenre());
        movie.setRating(request.getRating());
        return movie;
    }

    public MovieResponse toResponse(Movie movie) {
        MovieResponse response = new MovieResponse();
        response.setId(movie.getId());
        response.setTitle(movie.getTitle());
        response.setDirector(movie.getDirector());
        response.setReleaseYear(movie.getReleaseYear());
        response.setGenre(movie.getGenre());
        response.setRating(movie.getRating());
        return response;
    }
}
