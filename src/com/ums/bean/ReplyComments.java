package com.ums.bean;

public class ReplyComments {
    private Long replycommentsid;

    private Long replycommentsworkid;

    private Long oldcommentsuserid;

    private Long replycommentsuserid;

    private String replycommentscreatetime;

    private Byte replycommentsisshow;

    private String replycommentreason;

    private String replycommentmodifytime;

    private Long replyworkcommentsuserid;

    private Long replycommentsrcid;

    private String replydetail;

    public Long getReplycommentsid() {
        return replycommentsid;
    }

    public void setReplycommentsid(Long replycommentsid) {
        this.replycommentsid = replycommentsid;
    }

    public Long getReplycommentsworkid() {
        return replycommentsworkid;
    }

    public void setReplycommentsworkid(Long replycommentsworkid) {
        this.replycommentsworkid = replycommentsworkid;
    }

    public Long getOldcommentsuserid() {
        return oldcommentsuserid;
    }

    public void setOldcommentsuserid(Long oldcommentsuserid) {
        this.oldcommentsuserid = oldcommentsuserid;
    }

    public Long getReplycommentsuserid() {
        return replycommentsuserid;
    }

    public void setReplycommentsuserid(Long replycommentsuserid) {
        this.replycommentsuserid = replycommentsuserid;
    }

    public String getReplycommentscreatetime() {
        return replycommentscreatetime;
    }

    public void setReplycommentscreatetime(String replycommentscreatetime) {
        this.replycommentscreatetime = replycommentscreatetime == null ? null : replycommentscreatetime.trim();
    }

    public Byte getReplycommentsisshow() {
        return replycommentsisshow;
    }

    public void setReplycommentsisshow(Byte replycommentsisshow) {
        this.replycommentsisshow = replycommentsisshow;
    }

    public String getReplycommentreason() {
        return replycommentreason;
    }

    public void setReplycommentreason(String replycommentreason) {
        this.replycommentreason = replycommentreason == null ? null : replycommentreason.trim();
    }

    public String getReplycommentmodifytime() {
        return replycommentmodifytime;
    }

    public void setReplycommentmodifytime(String replycommentmodifytime) {
        this.replycommentmodifytime = replycommentmodifytime == null ? null : replycommentmodifytime.trim();
    }

    public Long getReplyworkcommentsuserid() {
        return replyworkcommentsuserid;
    }

    public void setReplyworkcommentsuserid(Long replyworkcommentsuserid) {
        this.replyworkcommentsuserid = replyworkcommentsuserid;
    }

    public Long getReplycommentsrcid() {
        return replycommentsrcid;
    }

    public void setReplycommentsrcid(Long replycommentsrcid) {
        this.replycommentsrcid = replycommentsrcid;
    }

    public String getReplydetail() {
        return replydetail;
    }

    public void setReplydetail(String replydetail) {
        this.replydetail = replydetail == null ? null : replydetail.trim();
    }
}