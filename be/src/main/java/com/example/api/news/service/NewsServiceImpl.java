package com.example.api.news.service;

import com.example.api.common.service.AbstractService;
import com.example.api.news.domain.News;
import com.example.api.news.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.Lazy;
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
    public Document connectUrl(String url) throws IOException {
        return Jsoup
                .connect(url)
                .method(Connection.Method.GET)
                .userAgent("Mozilla/5.0 (X11; Linux x86_64; rv:10.0) " +
                        "Gecko/20100101 Firefox/10.0 " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/51.0.2704.106 Safari/537.36")
                .execute()
                .parse();
    }

    @Override
    public Optional<News> findByNewsNo(String newsNo) {
        Optional.ofNullable(repo.findByNewsNo(newsNo)).ifPresent(System.out::println);
        return Optional.ofNullable(repo.findByNewsNo(newsNo));
    }

    @Override
    public void optionalInit(String newsNo) {
        Optional<String> optVal = Optional.empty();
    }

    @Override
    public Long saveAll(String category) throws IOException {
        Document document = connectUrl("https://news.daum.net/" + category);
        repo.deleteAll();

        Elements elements = document.select("div.cont_aside>ol>li>strong>a");

        News news = null;
        int count = 0;
        for (int i = 0; i < elements.size(); i++) {
            news = new News();

            news.setNewsNo(String.valueOf(repo.findAll().size() + 1));
            news.setAddress(elements.get(i).attr("href"));
            news.setCategory(category);
            news.setTitle(elements.get(i).text());
            count++;
            log.info(news.toString());
//            repo.save(news);
        }

        log.info("crawling count: " + count);
        return null;
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