package com.mysocials.service.task.model.dto;

import com.mysocials.service.task.common.RestApiResultCodeEnum;

public class RestApiCommonInfoDTO {
    private String resultCode = RestApiResultCodeEnum.SUCCESS.getCode();
    private String errorMsg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
