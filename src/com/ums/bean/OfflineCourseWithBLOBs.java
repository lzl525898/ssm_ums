package com.ums.bean;

public class OfflineCourseWithBLOBs extends OfflineCourse {
    private String cdesc;

    private String cdetailnotice;

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc == null ? null : cdesc.trim();
    }

    public String getCdetailnotice() {
        return cdetailnotice;
    }

    public void setCdetailnotice(String cdetailnotice) {
        this.cdetailnotice = cdetailnotice == null ? null : cdetailnotice.trim();
    }
}