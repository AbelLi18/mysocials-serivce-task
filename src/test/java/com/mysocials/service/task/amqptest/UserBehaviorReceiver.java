package com.mysocials.service.task.amqptest;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.USER_BEHAVIOR_QUEUE)
public class UserBehaviorReceiver {
    @RabbitHandler
    public void process(String userBehaviorDTO) {
        System.err.println(userBehaviorDTO);
    }
}
