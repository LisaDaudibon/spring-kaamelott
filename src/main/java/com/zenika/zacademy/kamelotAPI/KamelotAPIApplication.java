package com.zenika.zacademy.kamelotAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KamelotAPIApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KamelotAPIApplication.class, args);
		KamelotConfig configProperties = context.getBean(KamelotConfig.class);

		System.out.println(configProperties);
	}

}
