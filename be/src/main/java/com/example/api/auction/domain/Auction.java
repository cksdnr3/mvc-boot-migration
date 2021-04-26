package com.example.api.auction.domain;

import javax.persistence.*;

@Entity
@Table(name="auctions")
public class Auction {
    @Id @GeneratedValue
    @Column(name = "auction_id") private long auctionId;

    @Column(name = "reg_date") private String regDate;

    @Column(name = "win_bid") private String winBid;

    @Column(name = "reserved_price") private String reservedPrice;

    @Column(name = "placed_price") private String placedPrice;
}