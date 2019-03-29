package com.mysocials.service.task.service;

import com.mysocials.service.task.BaseSpringBootTest;
import com.mysocials.service.task.model.dto.UserTaskQueryDTO;
import com.mysocials.service.task.model.po.UserTaskPO;
import com.mysocials.service.task.repository.UserTaskRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

public class UserTaskServiceTest extends BaseSpringBootTest {
    @MockBean
    private UserTaskRepository userTaskRepository;

    @Autowired
    private UserTaskService userTaskService;

    @Before
    public void setUp() {
        List<UserTaskPO> userTaskPOList = new ArrayList<>();
        Mockito.when(userTaskRepository.listUserTask(new UserTaskPO())).thenReturn(userTaskPOList);
    }

    @Test
    public void listUserTask() throws Exception {
        Assert.assertTrue(userTaskService.listUserTask(new UserTaskQueryDTO()).isEmpty());
    }
}