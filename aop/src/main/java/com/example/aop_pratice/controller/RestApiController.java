package com.example.aop_pratice.controller;

import com.example.aop_pratice.annotation.Timer;
import com.example.aop_pratice.dto.User;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name) {

        System.out.println("get method " +id );
        System.out.println("get method " + name);
        return id+" "+ name;

    }

    @PostMapping("/post")
    public User post(@RequestBody User user)

    {

      return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        // db logic
        // 1~2 sec
        Thread.sleep(2000);
    }
}
