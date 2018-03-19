package com.ums.bean;

public class CourseNote {
    private Long id;

    private Long userid;

    private Long courseid;

    private Long coursemenuid;

    private String creattime;

    private Integer isshow;

    private String notedetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getCoursemenuid() {
        return coursemenuid;
    }

    public void setCoursemenuid(Long coursemenuid) {
        this.coursemenuid = coursemenuid;
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime == null ? null : creattime.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getNotedetail() {
        return notedetail;
    }

    public void setNotedetail(String notedetail) {
        this.notedetail = notedetail == null ? null : notedetail.trim();
    }
}