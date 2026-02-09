package io.github.nasrul78.cinelogue_api.service;

import java.util.List;

import io.github.nasrul78.cinelogue_api.domain.dto.request.MovieRequest;
import io.github.nasrul78.cinelogue_api.domain.dto.resource.MovieResponse;

public interface MovieService {
    MovieResponse saveMovie(MovieRequest movie);
    List<MovieResponse> getAllMovies();
    MovieResponse getMovieById(Long id);
    MovieResponse updateMovie(Long id, MovieRequest movie);
    void deleteMovieById(Long id);
}
