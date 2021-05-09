package com.example.api.user.service;

import com.example.api.user.domain.UserDTO;
import com.example.api.user.domain.UserVO;

import java.util.List;

public interface UserService {
    String signup(UserVO UserVO);
    UserDTO signin(UserVO UserVO);
    List<UserVO> findAll();
}
