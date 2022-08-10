package com.example.ioc2_re;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Component
public class UrlEncoder implements IEncoder{
    public String encode(String message) throws UnsupportedEncodingException {
        return URLEncoder.encode(message,"UTF-8");

    }



}
