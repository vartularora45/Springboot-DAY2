package com.example.day2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class home {
    @GetMapping("/about")
    public String about(){
        return "THIS IS ABOUT PAGE ....";
    }
}
