package com.example.api.auction.controller;

import com.example.api.auction.domain.Auction;
import com.example.api.auction.service.AuctionServiceImpl;
import com.example.api.common.controller.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AuctionController extends AbstractController<Auction> {
    private final AuctionServiceImpl service;

    @Override
    @PostMapping("")
    public ResponseEntity<Long> save(Auction auction) {
        return ResponseEntity.ok(service.save(auction));
    }

    @Override
    public ResponseEntity<Optional<Auction>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Auction>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Long> count() {
        return null;
    }

    @Override
    public ResponseEntity<Optional<Auction>> getOne(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Long> deleteById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> existById(Long id) {
        return null;
    }
}
