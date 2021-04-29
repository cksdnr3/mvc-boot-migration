package com.example.api.stream;

public class BoxMain {
    public static void main(String[] args) {
        Box b = new Box<Student>();

        b.put("1", new Student("chanuk","chanuk",3,4));

        System.out.println(b.get("1"));

        b.replace("1", new Student("hello", "hello", 2, 1));

        System.out.println(b.get("1"));

        b.remove("1");

        System.out.println(b.get("1"));
    }
}