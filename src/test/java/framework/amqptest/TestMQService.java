package framework.amqptest;

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
        this.amqpTemplate.convertAndSend(TestRabbitConfig.USER_BEHAVIOR_EXCHANGE, TestRabbitConfig.USER_BEHAVIOR_QUEUE, "zzzz");
    }
}
