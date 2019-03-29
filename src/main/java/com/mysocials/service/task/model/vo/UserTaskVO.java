package com.mysocials.service.task.model.vo;

import com.mysocials.service.task.common.RestApiResultCodeEnum;
import com.mysocials.service.task.model.dto.RestApiCommonInfoDTO;
import com.mysocials.service.task.model.po.UserTaskPO;

import java.util.List;

public class UserTaskVO {
    private RestApiCommonInfoDTO commonInfo;
    private List<UserTaskPO> data;

    public RestApiCommonInfoDTO getCommonInfo() {
        return commonInfo;
    }

    public void setCommonInfo(RestApiCommonInfoDTO commonInfo) {
        this.commonInfo = commonInfo;
    }

    public List<UserTaskPO> getData() {
        return data;
    }

    public void setData(List<UserTaskPO> data) {
        this.data = data;
    }
}
