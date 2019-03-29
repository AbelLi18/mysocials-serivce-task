package com.mysocials.service.task.amqptest.test;

import com.mysocials.service.task.BaseSpringBootTest;
import com.mysocials.service.task.amqptest.TestMQService;
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