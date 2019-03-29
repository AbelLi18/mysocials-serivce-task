package com.mysocials.service.task.mybatistest.test;

import com.mysocials.service.task.BaseSpringBootTest;
import com.mysocials.service.task.mybatistest.TaskPO;
import com.mysocials.service.task.mybatistest.TaskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskRepositoryTask extends BaseSpringBootTest {
    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void findTask() throws Exception {
        TaskPO taskPO = new TaskPO();
        taskPO.setId(1);
        Assert.assertNotNull(taskRepository.findTask(taskPO));
    }
}
