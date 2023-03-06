package com.example.mainmenums;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class italiancusine {
    @GetMapping("/italiancusine")
    public String getData(){
        return "Now you can Order food";
    }
}