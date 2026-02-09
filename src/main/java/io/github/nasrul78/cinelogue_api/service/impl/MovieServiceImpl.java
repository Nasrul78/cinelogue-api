package io.github.nasrul78.cinelogue_api.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import io.github.nasrul78.cinelogue_api.domain.dto.request.MovieRequest;
import io.github.nasrul78.cinelogue_api.domain.dto.resource.MovieResponse;
import io.github.nasrul78.cinelogue_api.domain.entity.Movie;
import io.github.nasrul78.cinelogue_api.domain.mapper.MovieMapper;
import io.github.nasrul78.cinelogue_api.exception.ResourceNotFoundException;
import io.github.nasrul78.cinelogue_api.repository.MovieRepository;
import io.github.nasrul78.cinelogue_api.service.MovieService;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository repository;
    private final MovieMapper mapper;

    @Override
    public MovieResponse saveMovie(MovieRequest movie) {
        Movie entity = mapper.toEntity(movie);
        Movie saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public List<MovieResponse> getAllMovies() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public MovieResponse getMovieById(Long id) {
        Movie movie = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie not found with id: " + id));
        return mapper.toResponse(movie);
    }

    @Override
    public MovieResponse updateMovie(Long id, MovieRequest movie) {
        Movie existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot update. Movie not found with id: " + id));

        existing.setTitle(movie.getTitle());
        existing.setDirector(movie.getDirector());
        existing.setReleaseYear(movie.getReleaseYear());
        existing.setGenre(movie.getGenre());
        existing.setRating(movie.getRating());

        Movie updated = repository.save(existing);
        return mapper.toResponse(updated);
    }

    @Override
    public void deleteMovieById(Long id) {
        Movie movie = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot delete. Movie not found with id: " + id));
        repository.delete(movie);
    }
}
