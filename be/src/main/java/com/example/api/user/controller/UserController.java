package com.example.api.user.controller;

import com.example.api.news.domain.News;
import com.example.api.user.domain.UserVO;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Log
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/all")
    public ResponseEntity<UserVO> all() {
        log.info("For All user");

        return ResponseEntity.ok(null);
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserVO> auth(@PathVariable String username) {
        log.info("For login user");

        return ResponseEntity.ok(null);
    }

    @GetMapping("/admin")
    public ResponseEntity<UserVO> admin(@PathVariable String username) {
        log.info("For admin");

        return ResponseEntity.ok(null);
    }


    @PostMapping("")
    public ResponseEntity<List<UserVO>> fetch(@RequestBody UserVO user) throws IOException {

        return ResponseEntity.ok(null);
    }

    @PutMapping("")
    public ResponseEntity<Long> update(@RequestBody UserVO user) {

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("")
    public ResponseEntity<Long> delete(@RequestBody UserVO user) {

        return ResponseEntity.ok(null);
    }
}
