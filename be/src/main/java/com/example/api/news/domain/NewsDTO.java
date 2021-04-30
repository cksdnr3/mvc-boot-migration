package com.example.api.news.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Component;


@Component
public class NewsDTO {
    private Long newsId;
    private String category;
    private String title;
    private String address;

}
