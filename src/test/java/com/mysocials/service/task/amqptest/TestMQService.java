package com.mysocials.service.task.amqptest;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestMQService {
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public TestMQService(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMsg() {
        this.amqpTemplate.convertAndSend(RabbitConfig.USER_BEHAVIOR_EXCHANGE, RabbitConfig.USER_BEHAVIOR_QUEUE, "zzzz");
    }
}
