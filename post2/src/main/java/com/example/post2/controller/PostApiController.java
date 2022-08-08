package com.example.post2.controller;

import com.example.post2.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto postRequestDto)
    {

        System.out.println("jhi");
        System.out.println(postRequestDto);
    }

}
