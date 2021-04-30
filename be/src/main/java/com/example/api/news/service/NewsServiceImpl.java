package com.example.api.news.service;

import com.example.api.common.domain.Crawler;
import com.example.api.common.service.AbstractService;
import com.example.api.common.service.CrawlerService;
import com.example.api.common.service.CrawlerServiceImpl;
import com.example.api.news.domain.News;
import com.example.api.news.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Log
@Lazy
@Service
@RequiredArgsConstructor
public class NewsServiceImpl extends AbstractService<News> implements NewsService {
    private final NewsRepository repo;

    @Override
    public void optionalInit(String newsNo) {
        Optional<String> optVal = Optional.empty();
    }

    @Override
    public Long saveAll(Crawler crawler) throws IOException {
        Document document = CrawlerService.connectUrl(crawler.getUrl());
        Elements elements = document.select(crawler.getCssQuery());

        News news = null;
        int countt = 0;
        for (int i = 0; i < elements.size(); i++) {
            news = new News();

            news.setAddress(elements.get(i).attr("href"));
            news.setCategory(crawler.getCategory());
            news.setTitle(elements.get(i).text());
            repo.save(news);
            log.info("count: " + countt++);
        }
        return (repo.count() > 0) ? 0L : 1L;
    }

    @Override
    public Page<News> retrievePosts(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public Long save(News news) {
        return repo.save(news) != null ? 1L : 0L;
    }

    @Override
    public Optional<News> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<News> findAll() {
        return repo.findAll();
    }

    @Override
    public Long count() {
        return repo.count();
    }

    @Override
    public Optional<News> getOne(Long id) {
        return Optional.ofNullable(repo.getOne(id));
    }

    @Override
    public Long deleteById(Long id) {
        repo.deleteById(id);

        return findById(id).orElse(null) != null ? 1L : 0L;
    }

    @Override
    public Boolean existById(Long id) {
        return repo.existsById(id);
    }
}