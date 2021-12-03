package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static Logger logger = LoggerFactory.getLogger(Demo2Application.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("application started...");
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
