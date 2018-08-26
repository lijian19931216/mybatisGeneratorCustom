package org.wcy.gen.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 任务信息表
 * 
 * @author wcyong
 * 
 * @date 2018-08-26
 */
public class TPfTaskInfo {
    private Long id;

    /**
     * 创建用户id
     */
    private Long crtUserId;

    /**
     * 创建时间
     */
    private Date crtTime;

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
     * 任务名称
     */
    private String taskName;

    /**
     * 任务编号(T+30位编号)
     */
    private String taskCode;

    /**
     * 业务id(一级分类)
     */
    private Long taskBusType1;

    /**
     * 二级分类
     */
    private Long taskBusType2;

    /**
     * 三级分类
     */
    private Long taskBusType3;

    /**
     * 开始日期
     */
    private Date startTime;

    /**
     * 结束日期
     */
    private Date endTime;

    /**
     * 状态，枚举，0-草稿，1-待审核，2-审核未通过，3-申核通过，4-发布中，5-已完成，6-暂停，7-已终止
     */
    private String state;

    /**
     * 外呼类型，1手动外呼，2自动外呼，3接呼
     */
    private Long callType1;

    /**
     * 自动外呼类型，1预测式，2渐进式，如果calltypecd值为手动外呼autocalltypecd值为空
     */
    private Long callType2;

    /**
     * 0000+01+6位企业标识+11+30位流水号（任务编号去T）
     */
    private String autoTaskId;

    /**
     * 任务类型(1：正式任务 2：试呼任务 3：回拨任务 4：测试任务)
     */
    private String taskType;

    /**
     * 主叫号码表id
     */
    private Long erOrgCallingNumId;

    /**
     * 主叫号码显示
     */
    private String callingNum;

    /**
     * 任务归属省份ID
     */
    private Integer provinceId;

    /**
     * 默认抢单等级限制
     */
    private Short gradeNo;

    /**
     * 发包方组织id
     */
    private Long erOrgId;

    /**
     * 分配方式:0-自由抢单，1-等级抢单
     */
    private String distMode;

    /**
     * 人员限制
     */
    private Integer personnelLimit;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 办理方式：0-线下办理，1-线上实时办理
     */
    private String handleWay;

    /**
     * 平台接单酬金
     */
    private BigDecimal platformPrice;

    /**
     * 接包方组织结算酬金
     */
    private BigDecimal spSettlePrice;

    /**
     * 日程表id
     */
    private Long scheduleId;

    /**
     * 是否允许抢单,0-允许，1-不允许
     */
    private String isGrab;

    /**
     * 样本处理状态：0-未处理，1-处理中，2-处理失败，3，处理成功
     */
    private String sampProcessState;

    /**
     * 样本总量
     */
    private Integer sampCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(Long crtUserId) {
        this.crtUserId = crtUserId;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
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

    public Long getTaskBusType1() {
        return taskBusType1;
    }

    public void setTaskBusType1(Long taskBusType1) {
        this.taskBusType1 = taskBusType1;
    }

    public Long getTaskBusType2() {
        return taskBusType2;
    }

    public void setTaskBusType2(Long taskBusType2) {
        this.taskBusType2 = taskBusType2;
    }

    public Long getTaskBusType3() {
        return taskBusType3;
    }

    public void setTaskBusType3(Long taskBusType3) {
        this.taskBusType3 = taskBusType3;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getCallType1() {
        return callType1;
    }

    public void setCallType1(Long callType1) {
        this.callType1 = callType1;
    }

    public Long getCallType2() {
        return callType2;
    }

    public void setCallType2(Long callType2) {
        this.callType2 = callType2;
    }

    public String getAutoTaskId() {
        return autoTaskId;
    }

    public void setAutoTaskId(String autoTaskId) {
        this.autoTaskId = autoTaskId == null ? null : autoTaskId.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public Long getErOrgCallingNumId() {
        return erOrgCallingNumId;
    }

    public void setErOrgCallingNumId(Long erOrgCallingNumId) {
        this.erOrgCallingNumId = erOrgCallingNumId;
    }

    public String getCallingNum() {
        return callingNum;
    }

    public void setCallingNum(String callingNum) {
        this.callingNum = callingNum == null ? null : callingNum.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Short getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(Short gradeNo) {
        this.gradeNo = gradeNo;
    }

    public Long getErOrgId() {
        return erOrgId;
    }

    public void setErOrgId(Long erOrgId) {
        this.erOrgId = erOrgId;
    }

    public String getDistMode() {
        return distMode;
    }

    public void setDistMode(String distMode) {
        this.distMode = distMode == null ? null : distMode.trim();
    }

    public Integer getPersonnelLimit() {
        return personnelLimit;
    }

    public void setPersonnelLimit(Integer personnelLimit) {
        this.personnelLimit = personnelLimit;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getHandleWay() {
        return handleWay;
    }

    public void setHandleWay(String handleWay) {
        this.handleWay = handleWay == null ? null : handleWay.trim();
    }

    public BigDecimal getPlatformPrice() {
        return platformPrice;
    }

    public void setPlatformPrice(BigDecimal platformPrice) {
        this.platformPrice = platformPrice;
    }

    public BigDecimal getSpSettlePrice() {
        return spSettlePrice;
    }

    public void setSpSettlePrice(BigDecimal spSettlePrice) {
        this.spSettlePrice = spSettlePrice;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getIsGrab() {
        return isGrab;
    }

    public void setIsGrab(String isGrab) {
        this.isGrab = isGrab == null ? null : isGrab.trim();
    }

    public String getSampProcessState() {
        return sampProcessState;
    }

    public void setSampProcessState(String sampProcessState) {
        this.sampProcessState = sampProcessState == null ? null : sampProcessState.trim();
    }

    public Integer getSampCount() {
        return sampCount;
    }

    public void setSampCount(Integer sampCount) {
        this.sampCount = sampCount;
    }
}