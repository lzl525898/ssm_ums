package com.ums.bean;

public class CourseQuestion {
    private Long questionid;

    private Long questioncourseid;

    private Long questionmenuid;

    private Long questionuserid;

    private String questionuserimg;

    private String questiontitle;

    private String questioncreatime;

    private Byte questionisshow;

    private String questionreason;

    private Byte questionstatus;

    private Integer questionpreviewnumber;

    private Integer questionanswernumber;

    private Integer praisenumber;

    private String questiondetail;

    public Long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    public Long getQuestioncourseid() {
        return questioncourseid;
    }

    public void setQuestioncourseid(Long questioncourseid) {
        this.questioncourseid = questioncourseid;
    }

    public Long getQuestionmenuid() {
        return questionmenuid;
    }

    public void setQuestionmenuid(Long questionmenuid) {
        this.questionmenuid = questionmenuid;
    }

    public Long getQuestionuserid() {
        return questionuserid;
    }

    public void setQuestionuserid(Long questionuserid) {
        this.questionuserid = questionuserid;
    }

    public String getQuestionuserimg() {
        return questionuserimg;
    }

    public void setQuestionuserimg(String questionuserimg) {
        this.questionuserimg = questionuserimg == null ? null : questionuserimg.trim();
    }

    public String getQuestiontitle() {
        return questiontitle;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle == null ? null : questiontitle.trim();
    }

    public String getQuestioncreatime() {
        return questioncreatime;
    }

    public void setQuestioncreatime(String questioncreatime) {
        this.questioncreatime = questioncreatime == null ? null : questioncreatime.trim();
    }

    public Byte getQuestionisshow() {
        return questionisshow;
    }

    public void setQuestionisshow(Byte questionisshow) {
        this.questionisshow = questionisshow;
    }

    public String getQuestionreason() {
        return questionreason;
    }

    public void setQuestionreason(String questionreason) {
        this.questionreason = questionreason == null ? null : questionreason.trim();
    }

    public Byte getQuestionstatus() {
        return questionstatus;
    }

    public void setQuestionstatus(Byte questionstatus) {
        this.questionstatus = questionstatus;
    }

    public Integer getQuestionpreviewnumber() {
        return questionpreviewnumber;
    }

    public void setQuestionpreviewnumber(Integer questionpreviewnumber) {
        this.questionpreviewnumber = questionpreviewnumber;
    }

    public Integer getQuestionanswernumber() {
        return questionanswernumber;
    }

    public void setQuestionanswernumber(Integer questionanswernumber) {
        this.questionanswernumber = questionanswernumber;
    }

    public Integer getPraisenumber() {
        return praisenumber;
    }

    public void setPraisenumber(Integer praisenumber) {
        this.praisenumber = praisenumber;
    }

    public String getQuestiondetail() {
        return questiondetail;
    }

    public void setQuestiondetail(String questiondetail) {
        this.questiondetail = questiondetail == null ? null : questiondetail.trim();
    }
}