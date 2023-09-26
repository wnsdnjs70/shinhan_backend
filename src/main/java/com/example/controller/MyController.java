package com.example.controller;

import com.example.config.MyConfig;
import com.example.config.MyConfigProto;
import com.example.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {


    private final MyService myService;
    private final MyConfig myConfig;

    @Autowired
    public MyController(MyService myService, MyConfig myConfig){
        this.myConfig = myConfig;
        this.myService = myService;
    }

    @GetMapping("/test")
    public String get(){
        return "test";
    }


}
