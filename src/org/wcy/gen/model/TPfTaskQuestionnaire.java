package org.wcy.gen.model;

import java.util.Date;

/**
 * 任务问卷关联表
 * 
 * @author wcyong
 * 
 * @date 2018-11-12
 */
public class TPfTaskQuestionnaire {
    /**
     * id
     */
    private Long id;

    /**
     * 问卷id
     */
    private Long questionnaireId;

    /**
     * 任务id
     */
    private Long taskId;

    /**
     * 创建时间
     */
    private Date crtTime;

    /**
     * 创建用户id
     */
    private Long crtUserId;

    /**
     * 创建系统id
     */
    private String crtAppSysId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Long questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Long getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(Long crtUserId) {
        this.crtUserId = crtUserId;
    }

    public String getCrtAppSysId() {
        return crtAppSysId;
    }

    public void setCrtAppSysId(String crtAppSysId) {
        this.crtAppSysId = crtAppSysId == null ? null : crtAppSysId.trim();
    }
}