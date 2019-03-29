package framework.mybatistest;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TaskRepository {
    TaskPO findTask(TaskPO taskPO);
}
