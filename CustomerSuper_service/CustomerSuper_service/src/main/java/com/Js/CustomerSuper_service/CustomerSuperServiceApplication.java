package com.Js.CustomerSuper_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerSuperServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSuperServiceApplication.class, args);
	}
        
        @Bean
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }

}
