package com.qa.springstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping("/goodbye")
    public String goodbyeWorld() {
        return "Goodbye World!";
    }
}
