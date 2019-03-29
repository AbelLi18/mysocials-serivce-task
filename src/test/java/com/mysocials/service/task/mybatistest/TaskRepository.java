package com.mysocials.service.task.mybatistest;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskRepository {
    TaskPO findTask(TaskPO taskPO);
}
