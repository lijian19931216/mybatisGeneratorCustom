package org.wcy.gen.model;

import java.util.Date;

/**
 * 问卷表
 * 
 * @author wcyong
 * 
 * @date 2018-11-12
 */
public class TPfQuestionnaire {
    /**
     * id
     */
    private Long id;

    /**
     * 问卷名称
     */
    private String qnaireName;

    /**
     * 问卷类型
     */
    private Integer qnaireType;

    /**
     * 问卷编号
     */
    private String qnaireCode;

    /**
     * 问卷状态0:草稿 1:发布中 2:已使用
     */
    private Integer qnaireStatus;

    /**
     * 有效状态：0:无效 1:有效
     */
    private Integer qnaireVisible;

    /**
     * 发包商组织id
     */
    private Long erOrgId;

    /**
     * 发包商公司名称
     */
    private String erOrgName;

    /**
     * 发包商公司编号
     */
    private String erOrgCode;

    /**
     * 备注
     */
    private String remark;

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

    /**
     * 扩展字段1
     */
    private String extended1;

    /**
     * 扩展字段2
     */
    private String extended2;

    /**
     * 扩展字段3
     */
    private String extended3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQnaireName() {
        return qnaireName;
    }

    public void setQnaireName(String qnaireName) {
        this.qnaireName = qnaireName == null ? null : qnaireName.trim();
    }

    public Integer getQnaireType() {
        return qnaireType;
    }

    public void setQnaireType(Integer qnaireType) {
        this.qnaireType = qnaireType;
    }

    public String getQnaireCode() {
        return qnaireCode;
    }

    public void setQnaireCode(String qnaireCode) {
        this.qnaireCode = qnaireCode == null ? null : qnaireCode.trim();
    }

    public Integer getQnaireStatus() {
        return qnaireStatus;
    }

    public void setQnaireStatus(Integer qnaireStatus) {
        this.qnaireStatus = qnaireStatus;
    }

    public Integer getQnaireVisible() {
        return qnaireVisible;
    }

    public void setQnaireVisible(Integer qnaireVisible) {
        this.qnaireVisible = qnaireVisible;
    }

    public Long getErOrgId() {
        return erOrgId;
    }

    public void setErOrgId(Long erOrgId) {
        this.erOrgId = erOrgId;
    }

    public String getErOrgName() {
        return erOrgName;
    }

    public void setErOrgName(String erOrgName) {
        this.erOrgName = erOrgName == null ? null : erOrgName.trim();
    }

    public String getErOrgCode() {
        return erOrgCode;
    }

    public void setErOrgCode(String erOrgCode) {
        this.erOrgCode = erOrgCode == null ? null : erOrgCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getExtended1() {
        return extended1;
    }

    public void setExtended1(String extended1) {
        this.extended1 = extended1 == null ? null : extended1.trim();
    }

    public String getExtended2() {
        return extended2;
    }

    public void setExtended2(String extended2) {
        this.extended2 = extended2 == null ? null : extended2.trim();
    }

    public String getExtended3() {
        return extended3;
    }

    public void setExtended3(String extended3) {
        this.extended3 = extended3 == null ? null : extended3.trim();
    }
}