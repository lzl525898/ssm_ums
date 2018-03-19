package com.ums.bean;

public class CourseAnswer {
    private Long anwserid;

    private Long anwserreplyid;

    private Long anwserquestionid;

    private Long answercourseid;

    private Long questioneruserid;

    private Long respondentsuserid;

    private String anwsercreatime;

    private Byte anwserisshow;

    private String anwsereason;

    private String anwsermodifytime;

    private Long anwsermodifyuserid;

    private Integer praisenum;

    private String respondentsdetail;

    public Long getAnwserid() {
        return anwserid;
    }

    public void setAnwserid(Long anwserid) {
        this.anwserid = anwserid;
    }

    public Long getAnwserreplyid() {
        return anwserreplyid;
    }

    public void setAnwserreplyid(Long anwserreplyid) {
        this.anwserreplyid = anwserreplyid;
    }

    public Long getAnwserquestionid() {
        return anwserquestionid;
    }

    public void setAnwserquestionid(Long anwserquestionid) {
        this.anwserquestionid = anwserquestionid;
    }

    public Long getAnswercourseid() {
        return answercourseid;
    }

    public void setAnswercourseid(Long answercourseid) {
        this.answercourseid = answercourseid;
    }

    public Long getQuestioneruserid() {
        return questioneruserid;
    }

    public void setQuestioneruserid(Long questioneruserid) {
        this.questioneruserid = questioneruserid;
    }

    public Long getRespondentsuserid() {
        return respondentsuserid;
    }

    public void setRespondentsuserid(Long respondentsuserid) {
        this.respondentsuserid = respondentsuserid;
    }

    public String getAnwsercreatime() {
        return anwsercreatime;
    }

    public void setAnwsercreatime(String anwsercreatime) {
        this.anwsercreatime = anwsercreatime == null ? null : anwsercreatime.trim();
    }

    public Byte getAnwserisshow() {
        return anwserisshow;
    }

    public void setAnwserisshow(Byte anwserisshow) {
        this.anwserisshow = anwserisshow;
    }

    public String getAnwsereason() {
        return anwsereason;
    }

    public void setAnwsereason(String anwsereason) {
        this.anwsereason = anwsereason == null ? null : anwsereason.trim();
    }

    public String getAnwsermodifytime() {
        return anwsermodifytime;
    }

    public void setAnwsermodifytime(String anwsermodifytime) {
        this.anwsermodifytime = anwsermodifytime == null ? null : anwsermodifytime.trim();
    }

    public Long getAnwsermodifyuserid() {
        return anwsermodifyuserid;
    }

    public void setAnwsermodifyuserid(Long anwsermodifyuserid) {
        this.anwsermodifyuserid = anwsermodifyuserid;
    }

    public Integer getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(Integer praisenum) {
        this.praisenum = praisenum;
    }

    public String getRespondentsdetail() {
        return respondentsdetail;
    }

    public void setRespondentsdetail(String respondentsdetail) {
        this.respondentsdetail = respondentsdetail == null ? null : respondentsdetail.trim();
    }
}