package com.example.api.news.service;

import com.example.api.news.domain.News;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface NewsService {
    public Document connectUrl(String url) throws IOException;
    public List<News> findAll();
    public Optional<News> findByNewsNo(String newsNo);
    public void optionalInit(String newsNo);
    public Long saveAll(String category) throws IOException;
}
