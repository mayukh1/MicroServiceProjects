package com.learning.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class JwtApplication {

    @RequestMapping("/")
    String hello() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(JwtApplication.class, args);
    }
}
