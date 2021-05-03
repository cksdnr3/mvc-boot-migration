package com.example.api.news.domain;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class NewsDTO {
    private Long newsId;
    private String category;
    private String title;
    private String address;

}
