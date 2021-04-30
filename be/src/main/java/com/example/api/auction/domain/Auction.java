package com.example.api.auction.domain;

import com.example.api.board.domain.Board;

import javax.persistence.*;

@Entity
@Table(name="auctions")
public class Auction {
    // 자식
    @Id @GeneratedValue
    @Column(name = "auction_id") private long auctionId;

    @Column(name = "reg_date") private String regDate;

    @Column(name = "win_bid") private String winBid;

    @Column(name = "reserved_price") private String reservedPrice;

    @Column(name = "placed_price") private String placedPrice;

//    @ManyToOne
//    @JoinColumn(name = "board_id") private Board board;
}