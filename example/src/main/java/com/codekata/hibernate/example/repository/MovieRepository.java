package com.codekata.hibernate.example.repository;

import com.codekata.hibernate.example.model.Movie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

    @EntityGraph(attributePaths = {"directors"})
    List<Movie> findAllByOrderByReleaseDateDesc();
}
