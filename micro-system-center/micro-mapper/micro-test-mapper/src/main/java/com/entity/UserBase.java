package com.entity;

import java.io.Serializable;
import java.util.Date;

public class UserBase implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.user_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.code
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.pwd
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.user_roster
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String userRoster;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.user_name
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.depart_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer departId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.user_post
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String userPost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.user_phone
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.user_email
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.ins_tm
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Date insTm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.leader
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Byte leader;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.status
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.create_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.system_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer systemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.update_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.daily_access_num
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer dailyAccessNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base.minute_access_num
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer minuteAccessNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_base
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.user_id
     *
     * @return the value of user_base.user_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.user_id
     *
     * @param userId the value for user_base.user_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.code
     *
     * @return the value of user_base.code
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.code
     *
     * @param code the value for user_base.code
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.pwd
     *
     * @return the value of user_base.pwd
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.pwd
     *
     * @param pwd the value for user_base.pwd
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.user_roster
     *
     * @return the value of user_base.user_roster
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getUserRoster() {
        return userRoster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.user_roster
     *
     * @param userRoster the value for user_base.user_roster
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserRoster(String userRoster) {
        this.userRoster = userRoster == null ? null : userRoster.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.user_name
     *
     * @return the value of user_base.user_name
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.user_name
     *
     * @param userName the value for user_base.user_name
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.depart_id
     *
     * @return the value of user_base.depart_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.depart_id
     *
     * @param departId the value for user_base.depart_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.user_post
     *
     * @return the value of user_base.user_post
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getUserPost() {
        return userPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.user_post
     *
     * @param userPost the value for user_base.user_post
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserPost(String userPost) {
        this.userPost = userPost == null ? null : userPost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.user_phone
     *
     * @return the value of user_base.user_phone
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.user_phone
     *
     * @param userPhone the value for user_base.user_phone
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.user_email
     *
     * @return the value of user_base.user_email
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.user_email
     *
     * @param userEmail the value for user_base.user_email
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.ins_tm
     *
     * @return the value of user_base.ins_tm
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Date getInsTm() {
        return insTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.ins_tm
     *
     * @param insTm the value for user_base.ins_tm
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setInsTm(Date insTm) {
        this.insTm = insTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.leader
     *
     * @return the value of user_base.leader
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Byte getLeader() {
        return leader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.leader
     *
     * @param leader the value for user_base.leader
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setLeader(Byte leader) {
        this.leader = leader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.status
     *
     * @return the value of user_base.status
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.status
     *
     * @param status the value for user_base.status
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.create_time
     *
     * @return the value of user_base.create_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.create_time
     *
     * @param createTime the value for user_base.create_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.system_id
     *
     * @return the value of user_base.system_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getSystemId() {
        return systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.system_id
     *
     * @param systemId the value for user_base.system_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.update_time
     *
     * @return the value of user_base.update_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.update_time
     *
     * @param updateTime the value for user_base.update_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.daily_access_num
     *
     * @return the value of user_base.daily_access_num
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getDailyAccessNum() {
        return dailyAccessNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.daily_access_num
     *
     * @param dailyAccessNum the value for user_base.daily_access_num
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setDailyAccessNum(Integer dailyAccessNum) {
        this.dailyAccessNum = dailyAccessNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base.minute_access_num
     *
     * @return the value of user_base.minute_access_num
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getMinuteAccessNum() {
        return minuteAccessNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base.minute_access_num
     *
     * @param minuteAccessNum the value for user_base.minute_access_num
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setMinuteAccessNum(Integer minuteAccessNum) {
        this.minuteAccessNum = minuteAccessNum;
    }
}