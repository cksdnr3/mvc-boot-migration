package com.example.api.common.service;

import com.example.api.common.domain.Crawler;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public interface CrawlerService {
    public static Document connectUrl(String url) throws IOException {
        return Jsoup
                .connect(url)
                .method(Connection.Method.GET)
                .userAgent("Mozilla/5.0 (X11; Linux x86_64; rv:10.0) " +
                        "Gecko/20100101 Firefox/10.0 " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/51.0.2704.106 Safari/537.36")
                .execute()
                .parse();
    };
    public List<?> scrapBugs(Crawler crawler) throws IOException;
}
