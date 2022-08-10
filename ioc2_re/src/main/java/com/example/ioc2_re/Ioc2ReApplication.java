package com.example.ioc2_re;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootApplication
public class Ioc2ReApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SpringApplication.run(Ioc2ReApplication.class, args);

		ApplicationContext context = ApplicationContextProvider.getContext();

	//	Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
		//UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

		Encoder encoder = context.getBean(Encoder.class);

		String url= "www.naver.com";
		String result = encoder.encode(url);
		System.out.println(result);


	}

}

@Configuration  // 한개의 클래스에서 여러개의 빈을 둘거임.
class AppConfig
{
	@Bean("base64E ")
	public Encoder encoder(Base64Encoder base64Encoder)
	{
		return new Encoder(base64Encoder);
	}
	@Bean
	public Encoder encoder(UrlEncoder urlEncoder)
	{
		return new Encoder(urlEncoder);
	}
}