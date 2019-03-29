package com.mysocials.service.task.model.dto;

/**
 * 用户行为推送数据的公共信息
 */
public class UserBehaviorCommonInfoDTO {
    /**
     * TODO
     */
    private String userAccountId;
    /**
     * TODO
     */
    private String productId;
    /**
     * TODO
     */
    private String fromProductId;
    /**
     * TODO
     */
    private String taskType;

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFromProductId() {
        return fromProductId;
    }

    public void setFromProductId(String fromProductId) {
        this.fromProductId = fromProductId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
}
