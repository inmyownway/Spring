package com.example.ioc2_re;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Base64Encoder implements IEncoder{

 
    public String encode(String message) {

        return Base64.getEncoder().encodeToString(message.getBytes());
    }

}
