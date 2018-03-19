package com.ums.bean;

public class Scwork {
    private Long scid;

    private Long scworkid;

    private Long scuserid;

    private String sctime;

    private Byte scstatus;

    private Byte sctype;

    public Long getScid() {
        return scid;
    }

    public void setScid(Long scid) {
        this.scid = scid;
    }

    public Long getScworkid() {
        return scworkid;
    }

    public void setScworkid(Long scworkid) {
        this.scworkid = scworkid;
    }

    public Long getScuserid() {
        return scuserid;
    }

    public void setScuserid(Long scuserid) {
        this.scuserid = scuserid;
    }

    public String getSctime() {
        return sctime;
    }

    public void setSctime(String sctime) {
        this.sctime = sctime == null ? null : sctime.trim();
    }

    public Byte getScstatus() {
        return scstatus;
    }

    public void setScstatus(Byte scstatus) {
        this.scstatus = scstatus;
    }

    public Byte getSctype() {
        return sctype;
    }

    public void setSctype(Byte sctype) {
        this.sctype = sctype;
    }
}