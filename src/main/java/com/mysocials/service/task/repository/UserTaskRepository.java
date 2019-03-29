package com.mysocials.service.task.repository;

import com.mysocials.service.task.model.po.UserTaskPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserTaskRepository {
    List<UserTaskPO> listUserTask(UserTaskPO userTaskPO);
}
