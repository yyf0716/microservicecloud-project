package com.yyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class UdmZuulApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(UdmZuulApp.class, args);
	}

}
