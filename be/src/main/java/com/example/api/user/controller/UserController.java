package com.example.api.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
@CrossOrigin("*")
public class UserController {

}
