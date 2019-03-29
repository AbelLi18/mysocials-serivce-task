package com.mysocials.service.task.api.mq;

import com.mysocials.service.task.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.USER_BEHAVIOR_QUEUE)
public class UserBehaviorReceiver {
    private final Logger logger = LoggerFactory.getLogger(UserBehaviorReceiver.class);

    @RabbitHandler
    public void process(String userBehaviorDTO) {
        logger.debug("获取到消息：{}", userBehaviorDTO);
    }
}
