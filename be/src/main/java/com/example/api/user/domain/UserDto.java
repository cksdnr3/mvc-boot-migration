package com.example.api.user.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@Component
public class UserDto {
    private long userId;
    private String username;
    private String password;
    private String name;
    private String birth;
    private String email;
}
