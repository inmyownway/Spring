package com.example.aop1_re.controller;

import com.example.aop1_re.dto.User;
import org.springframework.web.bind.annotation.*;
//http://localhost:8080/get1/100?name=steve
//http://localhost:8080/api/get1/100?name=steve
//
@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping("/get1/{id}")
    public String get(@PathVariable Long id, @RequestParam String name)
    {
        System.out.println(id + " "+name);
        return id+" "+name;
    }
    @PostMapping("/post")
    public User post(@RequestBody User user){

        System.out.println(user);
        return user;
    }
}
