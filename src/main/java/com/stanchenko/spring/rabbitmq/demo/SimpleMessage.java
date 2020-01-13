package com.stanchenko.spring.rabbitmq.demo;

import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@NoArgsConstructor
public class SimpleMessage implements Serializable {
    private String name;
    private String description;
}
