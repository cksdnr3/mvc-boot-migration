package com.example.api.article;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@Component
public class ArticleDto {
    private long articleId;
    private String writer;
    private String email;
    private String subject;
    private String content;
    private String regDate;
}
