package com.ums.bean;

public class CourseMenu {
    private Long id;

    private String coursename;

    private String courseid;

    private String videourl;

    private String courseimage;

    private String coursetime;

    private Integer menulvl;

    private Long parentmenulvl;

    private String createtime;

    private Integer createid;

    private Integer isdisplay;

    private Integer ismain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getCourseimage() {
        return courseimage;
    }

    public void setCourseimage(String courseimage) {
        this.courseimage = courseimage == null ? null : courseimage.trim();
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime == null ? null : coursetime.trim();
    }

    public Integer getMenulvl() {
        return menulvl;
    }

    public void setMenulvl(Integer menulvl) {
        this.menulvl = menulvl;
    }

    public Long getParentmenulvl() {
        return parentmenulvl;
    }

    public void setParentmenulvl(Long parentmenulvl) {
        this.parentmenulvl = parentmenulvl;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Integer getIsdisplay() {
        return isdisplay;
    }

    public void setIsdisplay(Integer isdisplay) {
        this.isdisplay = isdisplay;
    }

    public Integer getIsmain() {
        return ismain;
    }

    public void setIsmain(Integer ismain) {
        this.ismain = ismain;
    }
}