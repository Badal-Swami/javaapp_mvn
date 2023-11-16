package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<html><body style='background-color: blue; display: flex; justify-content: center; align-items: center; height: 100vh;'><h1 style='color: white;'>It is working!</h1></body></html>";
    }
}
