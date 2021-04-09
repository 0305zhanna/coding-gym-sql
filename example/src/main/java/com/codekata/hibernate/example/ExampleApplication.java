package com.codekata.hibernate.example;

import com.codekata.hibernate.example.model.Movie;
import com.codekata.hibernate.example.repository.MovieRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
		MovieRepository movieRepository = context.getBean(MovieRepository.class);

		Iterable<Movie> movies = movieRepository.findAllByOrderByReleaseDateDesc();

		movies.forEach(System.out::println);

	}
}
