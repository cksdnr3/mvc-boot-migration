package com.example.api.board.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class BoardDTO {
    private long boardId;
    private String title;
    private String content;
    private String username;
    private String regDate;
}
