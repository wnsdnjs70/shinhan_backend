package com.example.controller;

import com.example.domain.response.ShinhanTestResponse;
import com.example.service.ShinhanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.datatransfer.Clipboard;

@RestController
@RequestMapping("/shinhan")
@RequiredArgsConstructor
public class ShinhanController {

    private final ShinhanService shinhanService;

    @GetMapping("/test")
    public ResponseEntity<?> testApi() {
        Clipboard testService;
        ShinhanTestResponse shinhanTestResponse= shinhanService.getData();
        return ResponseEntity.ok(shinhanTestResponse);
    }

}
