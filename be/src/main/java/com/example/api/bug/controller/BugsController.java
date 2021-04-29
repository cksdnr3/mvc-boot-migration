package com.example.api.bug.controller;

import com.example.api.bug.domain.Bugs;
import com.example.api.bug.service.BugsServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Log
@RestController
@RequestMapping("bugs")
@RequiredArgsConstructor
public class BugsController {
    private final BugsServiceImpl service;

    @GetMapping("/chart/scrap")
    public ResponseEntity<List<Bugs>> bugs() throws IOException {
        log.info("bugs controller()");
        service.crawl();
//        service.findAll()
        return ResponseEntity.ok(null);
    }
}
