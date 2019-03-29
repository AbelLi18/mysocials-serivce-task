package com.mysocials.service.task.model.dto;

/**
 * 用户行为推送数据
 */
public class UserBehaviorDTO {
    /**
     * @see com.mysocials.service.task.model.dto.UserBehaviorCommonInfoDTO
     */
    private UserBehaviorCommonInfoDTO commonInfo;
    /**
     * TODO
     */
    private String messageBody;

    public UserBehaviorCommonInfoDTO getCommonInfo() {
        return commonInfo;
    }

    public void setCommonInfo(UserBehaviorCommonInfoDTO commonInfo) {
        this.commonInfo = commonInfo;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
