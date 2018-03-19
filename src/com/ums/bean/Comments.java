package com.ums.bean;

public class Comments {
    private Long commentsid;

    private Long commentsworkid;

    private Long commentsreleaseuserid;

    private String commentscreatetime;

    private Byte commentsisshow;

    private String commentreason;

    private String commentmodifytime;

    private Long commentmodifyuserid;

    private String commentreplydetail;

    private String commentsdetail;

    public Long getCommentsid() {
        return commentsid;
    }

    public void setCommentsid(Long commentsid) {
        this.commentsid = commentsid;
    }

    public Long getCommentsworkid() {
        return commentsworkid;
    }

    public void setCommentsworkid(Long commentsworkid) {
        this.commentsworkid = commentsworkid;
    }

    public Long getCommentsreleaseuserid() {
        return commentsreleaseuserid;
    }

    public void setCommentsreleaseuserid(Long commentsreleaseuserid) {
        this.commentsreleaseuserid = commentsreleaseuserid;
    }

    public String getCommentscreatetime() {
        return commentscreatetime;
    }

    public void setCommentscreatetime(String commentscreatetime) {
        this.commentscreatetime = commentscreatetime == null ? null : commentscreatetime.trim();
    }

    public Byte getCommentsisshow() {
        return commentsisshow;
    }

    public void setCommentsisshow(Byte commentsisshow) {
        this.commentsisshow = commentsisshow;
    }

    public String getCommentreason() {
        return commentreason;
    }

    public void setCommentreason(String commentreason) {
        this.commentreason = commentreason == null ? null : commentreason.trim();
    }

    public String getCommentmodifytime() {
        return commentmodifytime;
    }

    public void setCommentmodifytime(String commentmodifytime) {
        this.commentmodifytime = commentmodifytime == null ? null : commentmodifytime.trim();
    }

    public Long getCommentmodifyuserid() {
        return commentmodifyuserid;
    }

    public void setCommentmodifyuserid(Long commentmodifyuserid) {
        this.commentmodifyuserid = commentmodifyuserid;
    }

    public String getCommentreplydetail() {
        return commentreplydetail;
    }

    public void setCommentreplydetail(String commentreplydetail) {
        this.commentreplydetail = commentreplydetail == null ? null : commentreplydetail.trim();
    }

    public String getCommentsdetail() {
        return commentsdetail;
    }

    public void setCommentsdetail(String commentsdetail) {
        this.commentsdetail = commentsdetail == null ? null : commentsdetail.trim();
    }
}