package com.stanchenko.spring.rabbitmq.demo.consumer;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private final static String MESSAGE_QUEUE = "MessageQueue";

    @Bean
    Queue messageQueue() {
        return QueueBuilder.durable(MESSAGE_QUEUE)
                .build();
    }

    @Bean
    Exchange messageExchange() {
        return ExchangeBuilder.topicExchange("simpleExchange")
                .durable(true)
                .build();
    }

    @Bean
    Binding queueExchangeBinding() {
        return BindingBuilder.bind(messageQueue())
                .to(messageExchange())
                .with("simpleRoutingKey")
                .noargs();
    }

    @Bean
    ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        return connectionFactory;
    }

    @Bean
    MessageListenerContainer messageListenerContainer() {
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(connectionFactory());
        simpleMessageListenerContainer.setQueues(messageQueue());
        simpleMessageListenerContainer.setMessageListener(new RabbitMQMessageListener());
        return simpleMessageListenerContainer;
    }
}
