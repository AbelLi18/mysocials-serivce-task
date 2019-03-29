package com.mysocials.service.task.repository;

import com.mysocials.service.task.BaseSpringBootTest;
import com.mysocials.service.task.model.po.UserTaskPO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTaskRepositoryTest extends BaseSpringBootTest {
    @Autowired
    private UserTaskRepository userTaskRepository;

    @Test(expected = Exception.class)
    public void listUserTask() throws Exception {
        UserTaskPO userTaskPO = new UserTaskPO();
        userTaskRepository.listUserTask(userTaskPO);
    }
}