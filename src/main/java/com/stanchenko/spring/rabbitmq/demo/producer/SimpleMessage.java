package com.stanchenko.spring.rabbitmq.demo.producer;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@NoArgsConstructor
@ToString
public class SimpleMessage implements Serializable {
    private String name;
    private String description;
}
