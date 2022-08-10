package com.example.ioc2_re;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class Encoder {

    private IEncoder iEncoder;
    public Encoder(@Qualifier("urlEncoder") IEncoder iEncoder)
    {
        this.iEncoder=iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder)
    {
        this.iEncoder=iEncoder;

    }
    public String encode(String message) throws UnsupportedEncodingException {

        return iEncoder.encode(message);
    }

}
