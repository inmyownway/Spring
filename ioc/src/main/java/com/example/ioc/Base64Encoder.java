package com.example.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;
@Component
public class Base64Encoder implements IEncoder{
    public String encode(String meessages)
    {
        return Base64.getEncoder().encodeToString(meessages.getBytes());
    } 
}
