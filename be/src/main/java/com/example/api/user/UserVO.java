package com.example.api.user;

import javax.persistence.*;

@Entity
@Table(name="users")
public class UserVO {

    @Id
    @GeneratedValue
    @Column(name="user_id") private long userId;

    @Column(name="username") private String username;

    @Column(name="password") private String password;

    @Column(name="name") private String name;

    @Column(name="birth") private String birth;

    @Column(name="email") private String email;
}