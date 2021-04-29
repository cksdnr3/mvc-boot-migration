package com.example.api.news.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class NewsDTO {
    private Long newsId;
    private String newsNo;
    private String category;
    private String title;
    private String address;
}
