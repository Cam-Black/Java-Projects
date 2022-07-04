package com.qa.springstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiddleEarthController {
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
        return "<h1 style='text-align: center;'>They're taking the Hobbits to Isengard!</h1>";
    }

    @GetMapping("/gandalf")
    public String gandalf() {
        return "<h1 style='color: red;'>YOU... SHALL NOT... PASS!</h1>";
    }
}
