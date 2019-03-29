package com.mysocials.service.task.common;

public enum RestApiResultCodeEnum {
    SUCCESS("100", "请求正常"), WARN("200", "返回值异常"), FAIL("300", "系统异常");

    private final String code;
    private final String description;

    RestApiResultCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
