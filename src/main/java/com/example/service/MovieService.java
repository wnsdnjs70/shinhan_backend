package com.example.service;

import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
//
////    private static List<Movie> movies = new ArrayList<>();
////
////    @PostConstruct
////    public void init(){
////        movies.addAll(List.of(
////                new Movie(1,"영화1", 2021, LocalDateTime.now()),
////                new Movie(2,"영화2", 2022,LocalDateTime.now()),
////                new Movie(3,"영화3", 2023,LocalDateTime.now())
////        ));
////    }
//
//    public List<MovieResponse> getMovies() {
//        // 아래의 빌더를 template method 패턴으로 바꿀 수 있다.
//        return movies.stream().map(MovieResponse::of).toList();
//
////        return movies.stream().map(movie -> MovieResponse.builder()
////                    .id(movie.getId())
////                    .name(movie.getName())
////                    .productionYear(movie.getProductionYear())
////                    .build())
////                .toList();
//    }
//
//    public Movie getMovie(long movieId) {
//        return movies.stream()
//                .filter(movie -> movie.getId() == movieId)
//                .toList()
//                .stream()
//                .findFirst()
//                .orElseThrow();
//    }
//
//    public void createMovie(MovieRequest movieRequest) {
//
//        Movie movie = new Movie(
//                movies.size()+1,
//                movieRequest.getName(),
//                movieRequest.getProductionYear(),
//                LocalDateTime.now()
//        );
//
//        movies.add(movie);
//    }
//
//    public void updateMovie(long movieId, MovieRequest movieRequest) {
//
//        Movie movie = getMovie(movieId);
//        movie.setName(movieRequest.getName());
//        movie.setProductionYear(movieRequest.getProductionYear());
//
//    }
//
//    public void deleteMovie(long movieId) {
//        Movie movie = getMovie(movieId);
//        movies.remove(movie);
//    }
}
