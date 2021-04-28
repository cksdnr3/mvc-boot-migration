package com.example.api.stream;

import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
    private String name;
    private int grade;
    private int score;
    private String username;

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getScore() {
        return this.score;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    Student(String name, String username, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return 0;
    }
}

public class StreamMain {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("메뉴: 0.EXIT 1.학년 오름차순 2.성적 내림차순 3.이름 오름차순 4.ID 오름차순");
            switch (scanner.nextInt()) {
                case 0: return;
                case 1: ascGrade().forEach(System.out::println); break;
                case 2: descScore().forEach(System.out::println); break;
                case 3: ascName().forEach(System.out::println); break;
                case 4: ascUsername().forEach(System.out::println); break;
                default: break;
            }
        }
    }

    public static Stream<Student> makeStream() {
        DummyGenerator dg = new DummyGenerator();

        return dg.makeStudentList(10).stream();
    }

    public static Stream<Student> ascGrade() {
        return makeStream().sorted((prev, current) -> prev.getGrade() - current.getGrade());
    }

    public static Stream<Student> ascName() {
        return makeStream().sorted(Comparator.comparing(Student::getName));
    }

    public static Stream<Student> descScore() {
        return makeStream().sorted(Comparator.comparing(Student::getScore).reversed());
    }

    public static Stream<Student> ascUsername() {
        return makeStream().map(student -> {
            student.setUsername(student.getUsername().toLowerCase());
            return student;
        }).sorted(Comparator.comparing(Student::getUsername));
    }
}