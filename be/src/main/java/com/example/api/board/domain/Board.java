package com.example.api.board.domain;

import javax.persistence.*;

@Entity
@Table(name = "boards")
public class Board {
    @Id @GeneratedValue
    @Column(name = "board_id") private long boardId;

    @Column(name = "title") private String title;

    @Column(name = "content") private String content;

    @Column(name = "user_name") private String username;

    @Column(name = "reg_date") private String regDate;
}