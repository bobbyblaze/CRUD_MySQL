package com.learn.REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.learn.REST.repository")
@SpringBootApplication
public class Launcher {

    public static void main(String[] args){
        SpringApplication.run(Launcher.class, args);
    }
}
