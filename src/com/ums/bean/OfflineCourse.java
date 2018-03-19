package com.ums.bean;

public class OfflineCourse {
    private Long id;

    private String cname;

    private Long ctypeId;

    private String ctime;

    private String cprice;

    private String cpriceafter;

    private String cpicpath;

    private String ccreatetime;

    private String ccity;

    private String cintro;

    private String fitpeople;

    private Integer cstatus;

    private String nexttime;

    private String classplace;

    private Integer hours;

    private Integer learnhours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Long getCtypeId() {
        return ctypeId;
    }

    public void setCtypeId(Long ctypeId) {
        this.ctypeId = ctypeId;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getCprice() {
        return cprice;
    }

    public void setCprice(String cprice) {
        this.cprice = cprice == null ? null : cprice.trim();
    }

    public String getCpriceafter() {
        return cpriceafter;
    }

    public void setCpriceafter(String cpriceafter) {
        this.cpriceafter = cpriceafter == null ? null : cpriceafter.trim();
    }

    public String getCpicpath() {
        return cpicpath;
    }

    public void setCpicpath(String cpicpath) {
        this.cpicpath = cpicpath == null ? null : cpicpath.trim();
    }

    public String getCcreatetime() {
        return ccreatetime;
    }

    public void setCcreatetime(String ccreatetime) {
        this.ccreatetime = ccreatetime == null ? null : ccreatetime.trim();
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity == null ? null : ccity.trim();
    }

    public String getCintro() {
        return cintro;
    }

    public void setCintro(String cintro) {
        this.cintro = cintro == null ? null : cintro.trim();
    }

    public String getFitpeople() {
        return fitpeople;
    }

    public void setFitpeople(String fitpeople) {
        this.fitpeople = fitpeople == null ? null : fitpeople.trim();
    }

    public Integer getCstatus() {
        return cstatus;
    }

    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
    }

    public String getNexttime() {
        return nexttime;
    }

    public void setNexttime(String nexttime) {
        this.nexttime = nexttime == null ? null : nexttime.trim();
    }

    public String getClassplace() {
        return classplace;
    }

    public void setClassplace(String classplace) {
        this.classplace = classplace == null ? null : classplace.trim();
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getLearnhours() {
        return learnhours;
    }

    public void setLearnhours(Integer learnhours) {
        this.learnhours = learnhours;
    }
}