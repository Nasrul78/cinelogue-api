package io.github.nasrul78.cinelogue_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.nasrul78.cinelogue_api.domain.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}