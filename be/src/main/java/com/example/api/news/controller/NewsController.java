package com.example.api.news.controller;

import com.example.api.common.controller.AbstractController;
import com.example.api.common.domain.Crawler;
import com.example.api.news.domain.News;
import com.example.api.news.service.NewsServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Log
@RestController
@RequiredArgsConstructor
@RequestMapping("/news")
public class NewsController extends AbstractController<News> {
    private final NewsServiceImpl service;

    @PostMapping("/scrap")
    public ResponseEntity<List<News>> crawling(@RequestBody Crawler crawler) throws IOException {
        log.info("controller()");
        service.saveAll(crawler);
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/page")
    public ResponseEntity<Page<News>> retrievePosts(final Pageable pageable) {
        return ResponseEntity.ok(service.retrievePosts(pageable));
    }

    @PostMapping("")
    public ResponseEntity<List<News>> post(@RequestBody News news) throws IOException {

        return ResponseEntity.ok(null);
    }

    @GetMapping("")
    public ResponseEntity<News> fetch(@RequestBody News news) {

        return ResponseEntity.ok(null);
    }

    @PutMapping("")
    public ResponseEntity<Long> update(@RequestBody News news) {

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("")
    public ResponseEntity<Long> delete(@RequestBody News news) {
        return ResponseEntity.ok(null);
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
