package com.mysocials.service.task.amqptest;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    final static String USER_BEHAVIOR_QUEUE = "test";
    final static String USER_BEHAVIOR_EXCHANGE = "test-exchange";

    @Bean
    public Queue newQueue() {
        return new Queue(USER_BEHAVIOR_QUEUE);
    }

    @Bean
    public Exchange newDirectExchange() {
        return new DirectExchange(USER_BEHAVIOR_EXCHANGE, true, true);
    }

    @Bean
    public Binding newDirectBinding() {
        return BindingBuilder.bind(newQueue()).to(newDirectExchange()).with(USER_BEHAVIOR_QUEUE).noargs();
    }
}
