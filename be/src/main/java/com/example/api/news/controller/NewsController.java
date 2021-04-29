package com.example.api.news.controller;

import com.example.api.common.controller.AbstractController;
import com.example.api.news.domain.News;
import com.example.api.news.service.NewsServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Log
@RestController
@RequiredArgsConstructor
@RequestMapping("/news")
public class NewsController extends AbstractController<News> {
    private final NewsServiceImpl service;

    @GetMapping("/{category}/scrap")
    public ResponseEntity<List<News>> crawling(@PathVariable String category) throws IOException {
        log.info("controller()");

        service.saveAll(category);
//
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<Long> save(News news) {

        return null;
    }

    @Override
    public ResponseEntity<Optional<News>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<News>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<Long> count() {
        return null;
    }

    @Override
    public ResponseEntity<Optional<News>> getOne(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Long> deleteById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> existById(Long id) {
        return null;
    }
}
