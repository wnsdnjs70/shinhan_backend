package com.example.service;

import com.example.domain.response.ShinhanTestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShinhanService {

    private final UriRequestService uriRequestService;

    public ShinhanTestResponse getData() {

        ShinhanTestResponse response = uriRequestService.requestData(1695629800745L,1,1);
        System.out.println(response.getBBS_Title() + "   " + response.getBBS_TotalCount());

        return null;
    }
}
