package com.vib.jobtracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @GetMapping("/home")
    public String home() {
        return "Job Application Tracker is running!";
    }
}
