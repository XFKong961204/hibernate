package com.md;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Hibernate01Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate01Application.class, args);
    }

}
