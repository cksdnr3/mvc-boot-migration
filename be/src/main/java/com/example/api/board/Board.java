package com.example.api.board;

import javax.persistence.*;

@Entity
@Table(name="boards")
public class Board {

    @Id
    @GeneratedValue
    @Column(name="board_id") private long boardId;

    @Column(name="title") private String title;
}
