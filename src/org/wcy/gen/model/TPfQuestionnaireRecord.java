package org.wcy.gen.model;

import java.util.Date;

/**
 * 问卷记录表
 * 
 * @author wcyong
 * 
 * @date 2018-11-12
 */
public class TPfQuestionnaireRecord {
    private Long id;

    /**
     * 接续id
     */
    private Long touchId;

    /**
     * 问卷id
     */
    private Long qnaireId;

    /**
     * 问题id
     */
    private Long questionId;

    /**
     * 问题类型
     */
    private Integer questionType;

    /**
     * 问题答案
     */
    private String answer;

    /**
     * 任务id
     */
    private Long taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * 坐席id
     */
    private Long seatId;

    /**
     * 坐席姓名
     */
    private String seatName;

    /**
     * 坐席编号
     */
    private String seatCode;

    /**
     * 坐席等级
     */
    private String gradeNo;

    /**
     * cti坐席工号
     */
    private String ctiAgentId;

    /**
     * 坐席所属公司id
     */
    private Long spOrgId;

    /**
     * 服务商公司名称
     */
    private String spOrgName;

    /**
     * 服务商编号
     */
    private String spOrgCode;

    /**
     * 发包商组织id
     */
    private Long erOrgId;

    /**
     * 发包商公司名称
     */
    private String erOrgName;

    /**
     * 发包商编号
     */
    private String erOrgCode;

    /**
     * 呼叫标记内容
     */
    private String callMarkCntt;

    /**
     * 被叫客户真实号码
     */
    private String calledCustNum;

    /**
     * 被叫客户真实姓名
     */
    private String calledCustName;

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

    public Long getTouchId() {
        return touchId;
    }

    public void setTouchId(Long touchId) {
        this.touchId = touchId;
    }

    public Long getQnaireId() {
        return qnaireId;
    }

    public void setQnaireId(Long qnaireId) {
        this.qnaireId = qnaireId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName == null ? null : seatName.trim();
    }

    public String getSeatCode() {
        return seatCode;
    }

    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode == null ? null : seatCode.trim();
    }

    public String getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo == null ? null : gradeNo.trim();
    }

    public String getCtiAgentId() {
        return ctiAgentId;
    }

    public void setCtiAgentId(String ctiAgentId) {
        this.ctiAgentId = ctiAgentId == null ? null : ctiAgentId.trim();
    }

    public Long getSpOrgId() {
        return spOrgId;
    }

    public void setSpOrgId(Long spOrgId) {
        this.spOrgId = spOrgId;
    }

    public String getSpOrgName() {
        return spOrgName;
    }

    public void setSpOrgName(String spOrgName) {
        this.spOrgName = spOrgName == null ? null : spOrgName.trim();
    }

    public String getSpOrgCode() {
        return spOrgCode;
    }

    public void setSpOrgCode(String spOrgCode) {
        this.spOrgCode = spOrgCode == null ? null : spOrgCode.trim();
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

    public String getCallMarkCntt() {
        return callMarkCntt;
    }

    public void setCallMarkCntt(String callMarkCntt) {
        this.callMarkCntt = callMarkCntt == null ? null : callMarkCntt.trim();
    }

    public String getCalledCustNum() {
        return calledCustNum;
    }

    public void setCalledCustNum(String calledCustNum) {
        this.calledCustNum = calledCustNum == null ? null : calledCustNum.trim();
    }

    public String getCalledCustName() {
        return calledCustName;
    }

    public void setCalledCustName(String calledCustName) {
        this.calledCustName = calledCustName == null ? null : calledCustName.trim();
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