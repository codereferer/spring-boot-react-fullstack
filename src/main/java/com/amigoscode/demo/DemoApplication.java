package com.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(DemoApplication.class, args);
    }
}
