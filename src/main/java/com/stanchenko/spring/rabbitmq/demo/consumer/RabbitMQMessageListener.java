package com.stanchenko.spring.rabbitmq.demo.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("message = " + new String(message.getBody()));
    }
}
