package com.app.application;

import org.springframework.boot.SpringApplication;
import com.app.repository.UserRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.app.controller", "com.app.dao", "com.app.repository", "com.app.service"})
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
}