package com.example.api.auction.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@Component
public class AuctionDTO {
    private long auctionId;
    private String regDate;
    private String winBid;
    private String reservedPrice;
    private String placedPrice;
}
