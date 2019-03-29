package framework.amqptest.test;

import com.mysocials.service.task.BaseSpringBootTest;
import framework.amqptest.TestMQService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

public class TestMQServiceTest extends BaseSpringBootTest {
    @Autowired
    private TestMQService testMQService;

    @Test
    public void sendMsg() throws Exception {
        testMQService.sendMsg();
        TimeUnit.SECONDS.sleep(2);
    }
}