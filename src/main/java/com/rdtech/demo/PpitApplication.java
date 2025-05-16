package com.rdtech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PpitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpitApplication.class, args);
        System.out.println("Spring Boot application started!");
    }

    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to our REST API service!!";
    }

    
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "! Thanks for using our API.";
    }
}