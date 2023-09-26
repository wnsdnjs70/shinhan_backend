package com.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class UriBuilderService {
    private static final String URL =  "https://bbs2.shinhansec.com/bbs/list/gicompanyanalyst";

    public URI buildUri(long v, int curPage, int startPage){
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(URL);
        uriBuilder.queryParam("v", v);
        uriBuilder.queryParam("curPage", curPage);
        uriBuilder.queryParam("startPage", startPage);

        URI uri =uriBuilder.build().encode().toUri();

        System.out.println(uri);

        return uri;
    }
}
