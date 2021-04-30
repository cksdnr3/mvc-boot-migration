package com.example.api.bugs.domain;

import com.example.api.board.domain.Board;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "bugs")
@NoArgsConstructor
public class Bugs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private Long musicId;

    @Column(length = 20, nullable = false)
    private String musicNo;

    @Column(length = 20, nullable = false)
    private String rank;

    @Column(length = 20, nullable = false)
    private String title;

    @Column(length = 20, nullable = false)
    private String artist;

    @Column(length = 20, nullable = false)
    private String album;
//
//    @ManyToOne
//    @JoinColumn(name = "board") private Board board;
}
