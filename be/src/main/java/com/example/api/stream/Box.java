package com.example.api.stream;

import java.util.HashMap;

public class Box<T> {
    private HashMap<String, T> map;

    Box() {
        this.map = new HashMap<>();
    }

    public void clear() {
        map.clear();
    }

    public T get(String key) {
        return map.get(key);
    }

    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public T put(String key, T value) {
        return map.put(key, value);
    }

    public T remove(String key) {
        return map.remove(key);
    }

    public T replace(String key, T value) {
        return map.replace(key, value);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }
}
