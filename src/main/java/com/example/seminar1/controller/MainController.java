package com.example.seminar1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/main1")
    public String main1() {
        return "main1";
    }

    @GetMapping("/main2")
    public String main2() {
        return "main2";
    }
}
