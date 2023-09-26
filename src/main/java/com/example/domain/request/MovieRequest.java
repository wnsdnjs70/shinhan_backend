package com.example.domain.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@RequiredArgsConstructor
public class MovieRequest {

    private final String name;
    private final Integer productionYear;
    private Long directorId;

}
