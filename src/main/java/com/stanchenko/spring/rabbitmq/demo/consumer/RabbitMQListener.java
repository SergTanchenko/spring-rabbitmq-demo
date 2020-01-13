package com.stanchenko.spring.rabbitmq.demo.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQListener implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQListener.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
