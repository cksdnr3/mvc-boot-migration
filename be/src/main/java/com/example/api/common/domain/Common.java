package com.example.api.common.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/")
@RestController
public class Common {

    @GetMapping("")
    public String Home() {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        return format.format(new Date());
    }
}
