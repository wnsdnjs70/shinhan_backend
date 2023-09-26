package com.example.service;

import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService2 {

    private final EntityManagerFactory emf;

    private final MovieRepository movieRepository;

//    public List<MovieResponse> getMovies() {
//
//    }

    public MovieResponse getMovie(long movieId) {
//        EntityManager entityManager = emf.createEntityManager();
//        Movie movie = entityManager.find(Movie.class, movieId);

        Movie movie = movieRepository.findById(movieId).orElseThrow();

        return MovieResponse.of(movie);
    }

    @Transactional
    public void createMovie(MovieRequest movieRequest) {
        Movie movie = new Movie(movieRequest.getName(), movieRequest.getProductionYear());
        movieRepository.save(movie);
    }
//    public void createMovie(MovieRequest movieRequest) {
//        EntityManager entityManager = emf.createEntityManager();
//        EntityTransaction tx = entityManager.getTransaction();
//
//        try{
//            tx.begin();
//
//            Movie movie = new Movie(movieRequest.getName(), movieRequest.getProductionYear());
//            if(movie != null){
//                throw new RuntimeException("asd");
//            }
//
//            entityManager.persist(movie);
//            entityManager.flush();
//
//            tx.commit();
//
//        }
//        catch(Exception e){
//            tx.rollback();
//        }
//    }

    public void updateMovie(long movieId, MovieRequest movieRequest) {


    }

    public void deleteMovie(long movieId) {

    }
}
