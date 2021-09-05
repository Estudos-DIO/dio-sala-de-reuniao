package com.sala_de_reuniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "model" })
@EnableJpaRepositories(basePackages = { "repository" })
@ComponentScan(basePackages = {"controller;service;exception;"})
public class SalaDeReuniaoApplication {
	public static void main(String[] args) {
	SpringApplication.run(SalaDeReuniaoApplication.class, args);
}

}
