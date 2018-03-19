package com.ums.bean;

public class Sign {
    private Long signid;

    private Long signuserid;

    private String signtime;

    private Byte signstatus;

    private Integer signgodays;

    private Integer signsharenumbers;

    private Integer signcommentnumbers;

    private Integer signuploadfilenumbers;

    private Integer signnextintergal;

    public Long getSignid() {
        return signid;
    }

    public void setSignid(Long signid) {
        this.signid = signid;
    }

    public Long getSignuserid() {
        return signuserid;
    }

    public void setSignuserid(Long signuserid) {
        this.signuserid = signuserid;
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime == null ? null : signtime.trim();
    }

    public Byte getSignstatus() {
        return signstatus;
    }

    public void setSignstatus(Byte signstatus) {
        this.signstatus = signstatus;
    }

    public Integer getSigngodays() {
        return signgodays;
    }

    public void setSigngodays(Integer signgodays) {
        this.signgodays = signgodays;
    }

    public Integer getSignsharenumbers() {
        return signsharenumbers;
    }

    public void setSignsharenumbers(Integer signsharenumbers) {
        this.signsharenumbers = signsharenumbers;
    }

    public Integer getSigncommentnumbers() {
        return signcommentnumbers;
    }

    public void setSigncommentnumbers(Integer signcommentnumbers) {
        this.signcommentnumbers = signcommentnumbers;
    }

    public Integer getSignuploadfilenumbers() {
        return signuploadfilenumbers;
    }

    public void setSignuploadfilenumbers(Integer signuploadfilenumbers) {
        this.signuploadfilenumbers = signuploadfilenumbers;
    }

    public Integer getSignnextintergal() {
        return signnextintergal;
    }

    public void setSignnextintergal(Integer signnextintergal) {
        this.signnextintergal = signnextintergal;
    }
}