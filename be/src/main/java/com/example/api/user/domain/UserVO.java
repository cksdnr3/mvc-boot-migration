package com.example.api.user.domain;

import javax.persistence.*;

@Table(name = "users")
@Entity
public class UserVO {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "gender")
    private String gender;

    @Column(name = "reg_date")
    private String regDate;

    @Column(name = "phone_number")
    private String phoneNumber;
}
