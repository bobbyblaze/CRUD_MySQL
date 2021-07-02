package com.learn.CRUD_MySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages= "com.learn.CRUD_MySQL.repository")
@SpringBootApplication
public class Launcher {

    public static void main(String[] args){
        SpringApplication.run(Launcher.class, args);
    }
}

/**
 * @EnableJpaRepositories will scan the package of the annotated configuration class for
 * Spring Data repositories by default.
 * @SpringBootApplication annotation is used to mark a configuration class that declares one or
 * more @Bean methods and also triggers auto-configuration and component scanning. It's same as
 * declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.
 */