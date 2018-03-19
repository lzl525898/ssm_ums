package com.ums.bean;

import java.util.Date;

public class Menu {
    private Integer id;

    private String menuname;

    private String menupath;

    private String menuimage;

    private Integer menulvl;

    private Integer parentmenuid;

    private Date createtime;

    private Integer createuserid;

    private Integer isdisplay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenupath() {
        return menupath;
    }

    public void setMenupath(String menupath) {
        this.menupath = menupath == null ? null : menupath.trim();
    }

    public String getMenuimage() {
        return menuimage;
    }

    public void setMenuimage(String menuimage) {
        this.menuimage = menuimage == null ? null : menuimage.trim();
    }

    public Integer getMenulvl() {
        return menulvl;
    }

    public void setMenulvl(Integer menulvl) {
        this.menulvl = menulvl;
    }

    public Integer getParentmenuid() {
        return parentmenuid;
    }

    public void setParentmenuid(Integer parentmenuid) {
        this.parentmenuid = parentmenuid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Integer getIsdisplay() {
        return isdisplay;
    }

    public void setIsdisplay(Integer isdisplay) {
        this.isdisplay = isdisplay;
    }
}