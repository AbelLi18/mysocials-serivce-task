package com.mysocials.service.task.model.po;

/**
 * 映射用户任务表
 */
public class UserTaskPO {
    private Integer id;
    private String userAccountId;

    // TODO 补充剩余的字段

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }
}
