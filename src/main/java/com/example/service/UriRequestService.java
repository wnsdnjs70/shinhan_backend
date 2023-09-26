package com.example.service;

import com.example.domain.response.ShinhanTestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class UriRequestService {
    public final UriBuilderService uriBuilderService;

    public ShinhanTestResponse requestData(long v, int currPage, int startPage){

        if(ObjectUtils.isEmpty(v) || ObjectUtils.isEmpty(currPage) || ObjectUtils.isEmpty(startPage)) throw new IllegalArgumentException("input param is null");

        URI uri = uriBuilderService.buildUri(v, currPage, startPage);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity httpEntity = new HttpEntity<>(headers);

        return new RestTemplate().exchange(uri, HttpMethod.GET, httpEntity, ShinhanTestResponse.class).getBody();
    }
}
