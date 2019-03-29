package com.mysocials.service.task.api.web;

import com.mysocials.service.task.model.dto.UserTaskQueryDTO;
import com.mysocials.service.task.model.po.UserTaskPO;
import com.mysocials.service.task.model.vo.UserTaskVO;
import com.mysocials.service.task.service.UserTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
@Api(value = "任务相关API", tags = {"任务"})
@Profile({"dev", "test"})
public class TaskController {
    private final UserTaskService userTaskService;

    @Autowired
    public TaskController(UserTaskService userTaskService) {
        this.userTaskService = userTaskService;
    }

    /**
     * 查询用户的任务信息
     *
     * @param userTaskQueryDTO {@link UserTaskQueryDTO}
     * @return {@link UserTaskVO}
     */
    @ApiOperation(value = "获取用户的任务", notes = "获取用户的任务")
    @PostMapping("/user/list")
    public UserTaskVO listUserTask(@RequestBody UserTaskQueryDTO userTaskQueryDTO) {
        List<UserTaskPO> userTaskPOList = userTaskService.listUserTask(userTaskQueryDTO);
        UserTaskVO userTaskVO = new UserTaskVO();
        userTaskVO.setData(userTaskPOList);
        return userTaskVO;
    }
}
