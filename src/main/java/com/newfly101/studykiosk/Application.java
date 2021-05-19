package com.newfly101.studykiosk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.newfly101.studykiosk")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
