package com.yyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UdmConfigServerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(UdmConfigServerApp.class, args);
	}

}
