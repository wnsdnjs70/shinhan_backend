package com.example.service;

import com.example.domain.entity.Log;
import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.repository.LogRepository;
import com.example.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class MovieService2 {

    private final EntityManagerFactory emf;

    private final MovieRepository movieRepository;
    private final LogService logService;
    private final LogRepository logRepository;

    @Transactional
    public List<MovieResponse> getMovies() {
        List<Movie> movies = movieRepository.findByProductionYear(2001);
        return movies.stream().map(MovieResponse::of).toList();
    }

    @Transactional
    public MovieResponse getMovie(long movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow();
        return MovieResponse.of(movie);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void createMovie(MovieRequest movieRequest) {
        Movie movie = new Movie(movieRequest.getName(), movieRequest.getProductionYear());
        movieRepository.save(movie);

        logService.saveLog();
    }
    @Transactional
    public void updateMovie(Long movieId, MovieRequest movieRequest) {
        Movie movie = movieRepository.findById(movieId).orElseThrow();
        movie.setName("변경1");
    }

    public void deleteMovie(Long movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow();
        movieRepository.delete(movie);
    }


}
