package com.example.domain.response;

import com.example.domain.entity.Actor;
import com.example.domain.entity.Movie;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@Getter
@Builder
public class MovieResponse {
    private final Long id;
    private final String name;
    private final Integer productionYear;
    private final String directorName;
    private final List<String> actorNames;

    public static MovieResponse of(Movie movie){
        return new MovieResponse(
                movie.getId(),
                movie.getName(),
                movie.getProductionYear(),
                movie.getDirector().getName(),
                movie.getActors().stream().map(Actor::getName).toList());
    }
}
