package com.example.api.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Series<T> {
    private ArrayList<T> arrayList;

    Series() {
        this.arrayList = new ArrayList<>();
    }

    public boolean add(T o) {
        return arrayList.add(o);
    }

    public void clear() {
        arrayList.clear();
    }

    public boolean contains(T o) {
        return arrayList.contains(o);
    }

    public T get(int index) {
        return arrayList.get(index);
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public T remove(int index) {
        return arrayList.remove(index);
    }

    public int size() {
        return arrayList.size();
    }

    public void sort(Comparator c) {
        arrayList.sort(c);
    }
}
