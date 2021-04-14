package com.example.api.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/")
    public String printDate() {

        String now = new SimpleDateFormat("MM:dd HH:mm").format(new Date());

        return now;
    }
}