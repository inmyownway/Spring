package com.company.design;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;
    public Encoder(IEncoder iEncoder)
    {
        this.iEncoder=iEncoder;
    }


    public String encode(String message) throws UnsupportedEncodingException {

        return iEncoder.encode(message);
    }

}
