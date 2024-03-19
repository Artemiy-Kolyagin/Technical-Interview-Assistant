package com.interviewassistant.TechnicalInterviewAssistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class TechnicalInterviewAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalInterviewAssistantApplication.class, args);
	}

}
