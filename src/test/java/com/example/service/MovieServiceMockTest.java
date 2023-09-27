package com.example.service;

import com.example.domain.entity.Actor;
import com.example.domain.entity.Director;
import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.repository.MovieRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MovieServiceMockTest {

    @Mock
    private MovieRepository movieRepository;

    @Mock
    private LogService logService;

    @InjectMocks
    private MovieService2 movieService;

    @Test
    @DisplayName("영화 단건 조회 테스트")
    public void getMovieTest(){

        // given
        int movieId = 1;
        Movie movie = new Movie();
        movie.setName("영화1");
        movie.setDirector(new Director());
        movie.setActors(List.of(new Actor()));

        // when
        when(movieRepository.findById(anyLong())).thenReturn(null);

        // then
//        MovieResponse result = movieService.getMovie(movieId);
//        assertNotNull(result);
        assertThrows(NullPointerException.class, () -> movieService.getMovie((movieId)));

    }

    @Test
    @DisplayName("영화 다중 조회 테스트")
    public void getMoviesTest(){

        // given
        int productionYear = 2001;
        List<Movie> movies = new ArrayList<>();

        when(movieRepository.findByProductionYear(anyInt())).thenReturn(movies);

        assertFalse(!movies.isEmpty());
    }

    @Test
    @DisplayName("영화 저장 테스트")
    public void getMovieSaveTest(){

        // given
        MovieRequest request = new MovieRequest("영화1",2001, 1L);
        Movie movie = new Movie("영화1",2001);

        when(movieRepository.save(any(Movie.class))).thenReturn(movie);
        doNothing().when(logService).saveLog();


        movieService.createMovie(request);
    }
}
