package framework.amqptest;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestRabbitConfig {
    final static String USER_BEHAVIOR_QUEUE = "test";
    final static String USER_BEHAVIOR_EXCHANGE = "test-exchange";

    @Bean
    public Queue newTestQueue() {
        return new Queue(USER_BEHAVIOR_QUEUE);
    }

    @Bean
    public Exchange newTestDirectExchange() {
        return new DirectExchange(USER_BEHAVIOR_EXCHANGE, true, true);
    }

    @Bean
    public Binding newTestDirectBinding() {
        return BindingBuilder.bind(newTestQueue()).to(newTestDirectExchange()).with(USER_BEHAVIOR_QUEUE).noargs();
    }
}
