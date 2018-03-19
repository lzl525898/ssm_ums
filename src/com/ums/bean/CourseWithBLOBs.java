package com.ums.bean;

public class CourseWithBLOBs extends Course {
    private String cnotice;

    private String cdetailnotice;

    private String cdetaildesc;

    public String getCnotice() {
        return cnotice;
    }

    public void setCnotice(String cnotice) {
        this.cnotice = cnotice == null ? null : cnotice.trim();
    }

    public String getCdetailnotice() {
        return cdetailnotice;
    }

    public void setCdetailnotice(String cdetailnotice) {
        this.cdetailnotice = cdetailnotice == null ? null : cdetailnotice.trim();
    }

    public String getCdetaildesc() {
        return cdetaildesc;
    }

    public void setCdetaildesc(String cdetaildesc) {
        this.cdetaildesc = cdetaildesc == null ? null : cdetaildesc.trim();
    }
}