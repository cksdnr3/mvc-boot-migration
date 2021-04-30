package com.example.api.board.domain;

import com.example.api.auction.domain.Auction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boards")
public class Board {
    // 부모
    @Id @GeneratedValue
    @Column(name = "board_id") private long boardId;

    @Column(name = "title") private String title;

    @Column(name = "content") private String content;

    @Column(name = "user_name") private String username;

    @Column(name = "reg_date") private String regDate;

//    @OneToMany(mappedBy = "board")
//    private List<Auction> auctions = new ArrayList();
}