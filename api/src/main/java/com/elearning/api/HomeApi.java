package com.elearning.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/homes")
public class HomeApi {

    @GetMapping
    public String getHome() {
        return "{Home: Up}";
    }
}
