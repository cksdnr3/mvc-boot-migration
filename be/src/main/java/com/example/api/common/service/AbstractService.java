package com.example.api.common.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class AbstractService<T> {
    public abstract Long save(T t);
    public abstract Optional<T> findById(Long id);
    public abstract List<T> findAll();
    public abstract Long count();
    public abstract Optional<T> getOne(Long id);
    public abstract Long deleteById(Long id);
    public abstract Boolean existById(Long id);
}