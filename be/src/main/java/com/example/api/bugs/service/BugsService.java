package com.example.api.bugs.service;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public interface BugsService {
    public Document connectUrl(String url) throws IOException;
    public Long saveAll(Elements rank, Elements title,
                        Elements artist, Elements album) throws IOException;
    public void crawl() throws IOException;
}
