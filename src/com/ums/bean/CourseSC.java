package com.ums.bean;

public class CourseSC {
    private Long coursescid;

    private Long courseaboutid;

    private Long coursescuserid;

    private String coursesctime;

    private Byte coursescstatus;

    public Long getCoursescid() {
        return coursescid;
    }

    public void setCoursescid(Long coursescid) {
        this.coursescid = coursescid;
    }

    public Long getCourseaboutid() {
        return courseaboutid;
    }

    public void setCourseaboutid(Long courseaboutid) {
        this.courseaboutid = courseaboutid;
    }

    public Long getCoursescuserid() {
        return coursescuserid;
    }

    public void setCoursescuserid(Long coursescuserid) {
        this.coursescuserid = coursescuserid;
    }

    public String getCoursesctime() {
        return coursesctime;
    }

    public void setCoursesctime(String coursesctime) {
        this.coursesctime = coursesctime == null ? null : coursesctime.trim();
    }

    public Byte getCoursescstatus() {
        return coursescstatus;
    }

    public void setCoursescstatus(Byte coursescstatus) {
        this.coursescstatus = coursescstatus;
    }
}