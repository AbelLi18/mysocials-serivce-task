package com.mysocials.service.task.api.web;

import com.mysocials.service.task.common.RestApiResultCodeEnum;
import com.mysocials.service.task.model.dto.RestApiCommonInfoDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalRestApiExceptionResolver {
    @ExceptionHandler(Exception.class)
    public RestApiCommonInfoDTO handleException(Exception e) {
        RestApiCommonInfoDTO restApiCommonInfoDTO = new RestApiCommonInfoDTO();
        restApiCommonInfoDTO.setResultCode(RestApiResultCodeEnum.FAIL.getCode());
        restApiCommonInfoDTO.setErrorMsg(e.getMessage());
        return restApiCommonInfoDTO;
    }
}
