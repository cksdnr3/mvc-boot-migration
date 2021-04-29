package com.example.api.bug.service;

import com.example.api.bug.domain.Bugs;
import com.example.api.bug.repository.BugsRepository;
import com.example.api.common.service.AbstractService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Log
@Service
@RequiredArgsConstructor
public class BugsServiceImpl extends AbstractService<Bugs> implements BugsService {
    private final BugsRepository repo;

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
    public Long saveAll(Elements rank, Elements title,
                        Elements artist, Elements album){
        log.info("bugs saveAll()");

        Bugs bugs = null;
        for (int i = 0; i < rank.size(); i++) {
            bugs = new Bugs();

            bugs.setMusicNo(String.valueOf(repo.findAll().size() + 1));
            bugs.setRank(rank.get(i).text());
            bugs.setTitle(title.get(i).attr("href"));
            log.info(bugs.toString());
        }

        return null;
    }

    @Override
    public void crawl() throws IOException {
        Document document = connectUrl("https://music.bugs.co.kr/chart");
        repo.deleteAll();

        Elements rankingElem = document.select("div#CHARTrealtime>table>tbody>tr>td>div.ranking>strong");
        Elements titleElem = document.select("div#CHARTrealtime>table>tbody>tr>th>p>a");
        Elements artistElem = document.select("div#CHARTrealtime>table>tbody>tr>td>p.artist>a");
        Elements albumElem = document.select("div#CHARTrealtime>table>tbody>tr>td>a.album");

        log.info(rankingElem.toString());

        saveAll(rankingElem, titleElem, artistElem, albumElem);
    }


    @Override
    public Long save(Bugs bugs) {
        return null;
    }

    @Override
    public Optional<Bugs> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Bugs> findAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public Optional<Bugs> getOne(Long id) {
        return Optional.empty();
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean existById(Long id) {
        return null;
    }
}
