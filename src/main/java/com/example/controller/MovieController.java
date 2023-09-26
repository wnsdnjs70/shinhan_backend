package com.example.controller;

import com.example.common.Response;
import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.service.MovieService;
import com.example.service.MovieService2;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Tag(name="무비 컨트롤러다")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MovieController {

    private final MovieService2 movieService;

//    @GetMapping("/v1/movies")
//    public Response<List<MovieResponse>> getMovies(){
//
//        return Response.of(movieService.getMovies());
//    }

    @GetMapping("/v1/movies/{movieId}")
    public MovieResponse getMovie(
            @PathVariable(value = "movieId") long movieId
    ){
        return movieService.getMovie(movieId);
    }

    @PostMapping("/v1/movies")
    public void create(@RequestBody MovieRequest movieRequest){
        movieService.createMovie(movieRequest);
    }
//
//    @PutMapping("/v1/movies/{movieId}")
//    public void update(
//            @PathVariable(value = "movieId") long movieId,
//            @RequestBody MovieRequest movieRequest
//    ){
//        movieService.updateMovie(movieId, movieRequest);
//    }
//
//    @DeleteMapping("/v1/movies/{movieId}")
//    public void delete(
//            @PathVariable(value = "movieId") long movieId
//    ){
//        movieService.deleteMovie(movieId);
//    }
}
