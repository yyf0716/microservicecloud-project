package com.yyf.springcloud.config;

import java.io.File;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {
	@Bean
	public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
		ConfigurableEmbeddedServletContainer factory = new TomcatEmbeddedServletContainerFactory();
		factory.setDocumentRoot(new File(
				"D:\\project2\\microservicecloud-project\\microserviceudm\\spring-boot-shiro-redis\\src\\main\\webapp"));
		return (EmbeddedServletContainerFactory) factory;
	}
}
