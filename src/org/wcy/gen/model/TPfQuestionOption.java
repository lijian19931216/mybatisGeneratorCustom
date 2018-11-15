package org.wcy.gen.model;

import java.util.Date;

/**
 * 问卷问题项
 * 
 * @author wcyong
 * 
 * @date 2018-11-12
 */
public class TPfQuestionOption {
    /**
     * id
     */
    private Long id;

    /**
     * 问题id
     */
    private Long questionId;

    /**
     * 排序号
     */
    private Integer serialNum;

    /**
     * 问题项内容
     */
    private String optionContent;

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

    /**
     * 修改用户id
     */
    private Long modfUserId;

    /**
     * 修改时间
     */
    private Date modfTime;

    /**
     * 修改系统id
     */
    private String modfAppSysId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent == null ? null : optionContent.trim();
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

    public Long getModfUserId() {
        return modfUserId;
    }

    public void setModfUserId(Long modfUserId) {
        this.modfUserId = modfUserId;
    }

    public Date getModfTime() {
        return modfTime;
    }

    public void setModfTime(Date modfTime) {
        this.modfTime = modfTime;
    }

    public String getModfAppSysId() {
        return modfAppSysId;
    }

    public void setModfAppSysId(String modfAppSysId) {
        this.modfAppSysId = modfAppSysId == null ? null : modfAppSysId.trim();
    }
}