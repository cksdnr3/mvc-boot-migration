package com.example.api.auction.service;

import com.example.api.auction.domain.Auction;
import com.example.api.auction.repository.AuctionRepository;
import com.example.api.common.service.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuctionServiceImpl extends AbstractService<Auction> implements AuctionService {
    private final AuctionRepository repo;

    @Override
    public Long save(Auction auction) {
        return (repo.save(auction) != null) ? 1L : 0L;
    }

    @Override
    public Optional<Auction> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Auction> findAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public Optional<Auction> getOne(Long id) {
        return Optional.empty();
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean existById(Long id) {
        return null;
    }
}
