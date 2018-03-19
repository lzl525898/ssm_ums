package com.ums.bean;

public class CourseMy {
    private Long mid;

    private Long courseid;

    private Long userid;

    private Long progress;

    private String studytime;

    private Long menuid;

    private Integer menulearn;

    private Integer menuall;

    private String starttime;

    private String endtime;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getProgress() {
        return progress;
    }

    public void setProgress(Long progress) {
        this.progress = progress;
    }

    public String getStudytime() {
        return studytime;
    }

    public void setStudytime(String studytime) {
        this.studytime = studytime == null ? null : studytime.trim();
    }

    public Long getMenuid() {
        return menuid;
    }

    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }

    public Integer getMenulearn() {
        return menulearn;
    }

    public void setMenulearn(Integer menulearn) {
        this.menulearn = menulearn;
    }

    public Integer getMenuall() {
        return menuall;
    }

    public void setMenuall(Integer menuall) {
        this.menuall = menuall;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}