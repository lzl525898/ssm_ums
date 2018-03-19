package com.ums.bean;

public class Order {
    private Long id;

    private Long userid;

    private Long childid;

    private Long courseid;

    private Integer status;

    private String ordernum;

    private String time;

    private String endtime;

    private String qrpath;

    private String qrpathWx;

    private Integer type;

    private String amount;

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

    public Long getChildid() {
        return childid;
    }

    public void setChildid(Long childid) {
        this.childid = childid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getQrpath() {
        return qrpath;
    }

    public void setQrpath(String qrpath) {
        this.qrpath = qrpath == null ? null : qrpath.trim();
    }

    public String getQrpathWx() {
        return qrpathWx;
    }

    public void setQrpathWx(String qrpathWx) {
        this.qrpathWx = qrpathWx == null ? null : qrpathWx.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }
}