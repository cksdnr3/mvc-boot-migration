package com.example.api.user.service;

import com.example.api.security.domain.SecurityProvider;
import com.example.api.security.exception.SecurityRuntimeException;
import com.example.api.user.domain.Role;
import com.example.api.user.domain.UserDTO;
import com.example.api.user.domain.UserVO;
import com.example.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repo;
    private final PasswordEncoder passwordEncoder;
    private final SecurityProvider provider;
    private final AuthenticationManager manager;
    private final ModelMapper modelMapper;

    @Override
    public String signup(UserVO userVO) {
        if(!repo.existsByUsername(userVO.getUsername())) {
            userVO.setPassword(passwordEncoder.encode(userVO.getPassword()));
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);

            repo.save(userVO);
            return provider.createToken(userVO.getUsername(), list);
        } else {
            throw new SecurityRuntimeException("username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
sadasdasdad
    @Override
    public UserDTO signin(UserVO userVO) {
        try {
            UserVO loginUserVO = repo.login(userVO.getUsername(), userVO.getPassword());
            String token = provider.createToken(userVO.getUsername(), repo.findByUsername(userVO.getUsername()).getRoles());
            UserDTO loginUserDTO = modelMapper.map(loginUserVO, UserDTO.class);
            loginUserDTO.setToken(token);

            log.info(":::::::Issued Token:::::::", token);

            return loginUserDTO;
        } catch(Exception e) {
            throw new SecurityRuntimeException("Invalid Username / Password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @Override
    public List<UserVO> findAll() {
        return repo.findAll();
    }
}
