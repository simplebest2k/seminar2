package com.example.seminar1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    @GetMapping("/time1")
    public String time1() {
        return "time1";
    }
}
