package com.example.api.user.controller;

import com.example.api.news.domain.News;
import com.example.api.user.domain.UserDTO;
import com.example.api.user.domain.UserVO;
import com.example.api.user.service.UserServiceImpl;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@Api(tags = "users")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {
    private final UserServiceImpl service;
    private final ModelMapper modelMapper;

    @PostMapping("/signup")
    @ApiOperation(value = "${UserController.signup}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 403, message = "Access Denied"),
            @ApiResponse(code = 422, message = "Username is already in use")})
    public ResponseEntity<String> signup(@ApiParam("signup user") @RequestBody UserDTO userDTO) {

        return ResponseEntity.ok(service.signup(modelMapper.map(userDTO, UserVO.class)));
    }

    @PostMapping("/signin")
    @ApiOperation(value = "${UserController.signin}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 422, message = "Invalid Username . Password supplied")})
    public ResponseEntity<UserDTO> signin(@ApiParam("signin user") @RequestBody UserDTO userDTO) {

        return ResponseEntity.ok(service.signin(modelMapper.map(userDTO, UserVO.class)));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<UserVO>> findAll() {
        log.info("For All user");

        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/{username}")
    public ResponseEntity<UserVO> auth(@PathVariable String username) {
        log.info("For login user");

        return ResponseEntity.ok(null);
    }

    @GetMapping("/admin")
    public ResponseEntity<UserVO> admin(@PathVariable String username) {
        log.info("For admin");

        return ResponseEntity.ok(null);
    }

}