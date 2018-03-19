package com.ums.bean;

public class Integrationdetail {
    private Long detailid;

    private Long duserid;

    private Integer integrationnum;

    private String integrationtype;

    private String dcreatetime;

    private Long dcreateman;

    private String dxdetail;

    public Long getDetailid() {
        return detailid;
    }

    public void setDetailid(Long detailid) {
        this.detailid = detailid;
    }

    public Long getDuserid() {
        return duserid;
    }

    public void setDuserid(Long duserid) {
        this.duserid = duserid;
    }

    public Integer getIntegrationnum() {
        return integrationnum;
    }

    public void setIntegrationnum(Integer integrationnum) {
        this.integrationnum = integrationnum;
    }

    public String getIntegrationtype() {
        return integrationtype;
    }

    public void setIntegrationtype(String integrationtype) {
        this.integrationtype = integrationtype == null ? null : integrationtype.trim();
    }

    public String getDcreatetime() {
        return dcreatetime;
    }

    public void setDcreatetime(String dcreatetime) {
        this.dcreatetime = dcreatetime == null ? null : dcreatetime.trim();
    }

    public Long getDcreateman() {
        return dcreateman;
    }

    public void setDcreateman(Long dcreateman) {
        this.dcreateman = dcreateman;
    }

    public String getDxdetail() {
        return dxdetail;
    }

    public void setDxdetail(String dxdetail) {
        this.dxdetail = dxdetail == null ? null : dxdetail.trim();
    }
}