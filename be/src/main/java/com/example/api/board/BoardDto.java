package com.example.api.board;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class BoardDto {
    private long boardId;
    private String writer;
    private String email;
    private String subject;
    private String content;
    private String regDate;
}
