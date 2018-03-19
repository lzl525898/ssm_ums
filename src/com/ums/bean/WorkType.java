package com.ums.bean;

public class WorkType {
    private Long worktypeid;

    private Byte worktypelevel;

    private Long worktypetopid;

    private Long worktypefirstid;

    private Long worktypesecondid;

    private String worktypename;

    private Long worktypecreateuserid;

    private Long worktypemodifyuserid;

    private String worktypecreatetime;

    private String worktypemodifytime;

    private Byte worktypeisshow;

    public Long getWorktypeid() {
        return worktypeid;
    }

    public void setWorktypeid(Long worktypeid) {
        this.worktypeid = worktypeid;
    }

    public Byte getWorktypelevel() {
        return worktypelevel;
    }

    public void setWorktypelevel(Byte worktypelevel) {
        this.worktypelevel = worktypelevel;
    }

    public Long getWorktypetopid() {
        return worktypetopid;
    }

    public void setWorktypetopid(Long worktypetopid) {
        this.worktypetopid = worktypetopid;
    }

    public Long getWorktypefirstid() {
        return worktypefirstid;
    }

    public void setWorktypefirstid(Long worktypefirstid) {
        this.worktypefirstid = worktypefirstid;
    }

    public Long getWorktypesecondid() {
        return worktypesecondid;
    }

    public void setWorktypesecondid(Long worktypesecondid) {
        this.worktypesecondid = worktypesecondid;
    }

    public String getWorktypename() {
        return worktypename;
    }

    public void setWorktypename(String worktypename) {
        this.worktypename = worktypename == null ? null : worktypename.trim();
    }

    public Long getWorktypecreateuserid() {
        return worktypecreateuserid;
    }

    public void setWorktypecreateuserid(Long worktypecreateuserid) {
        this.worktypecreateuserid = worktypecreateuserid;
    }

    public Long getWorktypemodifyuserid() {
        return worktypemodifyuserid;
    }

    public void setWorktypemodifyuserid(Long worktypemodifyuserid) {
        this.worktypemodifyuserid = worktypemodifyuserid;
    }

    public String getWorktypecreatetime() {
        return worktypecreatetime;
    }

    public void setWorktypecreatetime(String worktypecreatetime) {
        this.worktypecreatetime = worktypecreatetime == null ? null : worktypecreatetime.trim();
    }

    public String getWorktypemodifytime() {
        return worktypemodifytime;
    }

    public void setWorktypemodifytime(String worktypemodifytime) {
        this.worktypemodifytime = worktypemodifytime == null ? null : worktypemodifytime.trim();
    }

    public Byte getWorktypeisshow() {
        return worktypeisshow;
    }

    public void setWorktypeisshow(Byte worktypeisshow) {
        this.worktypeisshow = worktypeisshow;
    }
}