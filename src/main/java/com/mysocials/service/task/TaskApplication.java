package com.mysocials.service.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        Logger logger = LoggerFactory.getLogger(TaskApplication.class);
        logger.debug("FFFF");
    }

}
