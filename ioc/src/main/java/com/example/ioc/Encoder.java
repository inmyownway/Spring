package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;
@Component
public class Encoder {
    private IEncoder iEncoder;

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public Encoder(@Qualifier("urlEncoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String meessages) {
        return iEncoder.encode(meessages);
    }
}

