package framework.amqptest;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = TestRabbitConfig.USER_BEHAVIOR_QUEUE)
public class TestReceiver {
    @RabbitHandler
    public void process(String userBehaviorDTO) {
        System.err.println(userBehaviorDTO);
    }
}
