package com.mysocials.service.task.service;

import com.mysocials.service.task.model.dto.UserTaskQueryDTO;
import com.mysocials.service.task.model.po.UserTaskPO;
import com.mysocials.service.task.repository.UserTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTaskService {
    private final UserTaskRepository userTaskRepository;

    @Autowired
    public UserTaskService(UserTaskRepository userTaskRepository) {
        this.userTaskRepository = userTaskRepository;
    }

    public List<UserTaskPO> listUserTask(UserTaskQueryDTO userTaskDTO) {
        UserTaskPO userTaskPO = new UserTaskPO();
        // TODO
        return userTaskRepository.listUserTask(userTaskPO);
    }
}
