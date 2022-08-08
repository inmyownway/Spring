

package com.example.aop1.controller;
import com.example.aop1.dto.User;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class RestApiController {


    @PostMapping("/post")
    public void post(@RequestBody User postRequestDto)
    {


        System.out.println(postRequestDto);
    }




}
