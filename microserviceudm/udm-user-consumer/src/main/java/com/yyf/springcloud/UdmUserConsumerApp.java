package com.yyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = { "com.yyf.springcloud" })
@ComponentScan("com.yyf.springcloud")
public class UdmUserConsumerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(UdmUserConsumerApp.class, args);
	}

}
