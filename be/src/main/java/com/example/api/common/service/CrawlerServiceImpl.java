package com.example.api.common.service;

import com.example.api.common.domain.Crawler;
import com.example.api.news.domain.News;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CrawlerServiceImpl implements CrawlerService {

    @Override
    public List<?> scrapBugs(Crawler crawler) throws IOException {
        Document document = CrawlerService.connectUrl(crawler.getUrl());
        Elements elements = document.select(crawler.getCssQuery());

        for (int i = 0; i < elements.size(); i++) {

        }
        return null;
    }
}
