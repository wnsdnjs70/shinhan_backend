package com.example.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ShinhanTestResponse {
    @JsonProperty("BBS_TotalCount")
    private String BBS_TotalCount;

    @JsonProperty("BBS_Title")
    private String BBS_Title;
}
