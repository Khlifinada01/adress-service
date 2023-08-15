package com.example.adressservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdressServiceApplication {



    public static void main(String[] args) {

        SpringApplication.run(AdressServiceApplication.class, args);
    }

}
