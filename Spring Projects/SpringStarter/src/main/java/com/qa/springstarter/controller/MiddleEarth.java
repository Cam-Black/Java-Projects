package com.qa.springstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiddleEarth {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/goodbye")
    public String goodbyeWorld() {
        return "Goodbye World!";
    }

    @GetMapping("/isengard")
    public String isengard() {
        return "They're taking the Hobbits to Isengard!";
    }
}
