package com.example.mainmenums;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indiancusine {
    @GetMapping("/indiancusine")
    public String getData(){
        return "Order food";
    }
}