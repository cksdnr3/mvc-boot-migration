package com.example.api.user.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Table(name = "users")
@Entity
public class UserVO {
    @Id
    @GeneratedValue()
    @Column(name = "user_id") private long userId;
    @Column(unique = true, nullable = false) private String username;
    @Column(unique = true, nullable = false) private String email;
    @Size(min = 8, message = "Minimum password length: 8")
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles;
}
