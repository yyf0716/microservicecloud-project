package com.yyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker
public class UdmUserProviderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(UdmUserProviderApp.class, args);
	}

}
