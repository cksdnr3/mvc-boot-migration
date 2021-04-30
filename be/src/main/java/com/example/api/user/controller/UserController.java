package com.example.api.user.controller;

import com.example.api.news.domain.News;
import com.example.api.user.domain.UserVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping("")
    public ResponseEntity<List<UserVO>> fetch(@RequestBody UserVO user) throws IOException {

        return ResponseEntity.ok(null);
    }

    @GetMapping("")
    public ResponseEntity<UserVO> join(@RequestBody UserVO user) {

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
