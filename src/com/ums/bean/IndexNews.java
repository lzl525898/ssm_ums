package com.ums.bean;

public class IndexNews {
    private Long id;

    private String title;

    private String newsabstract;

    private String createtime;

    private Integer type;

    private String imgurl;

    private String showimg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNewsabstract() {
        return newsabstract;
    }

    public void setNewsabstract(String newsabstract) {
        this.newsabstract = newsabstract == null ? null : newsabstract.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getShowimg() {
        return showimg;
    }

    public void setShowimg(String showimg) {
        this.showimg = showimg == null ? null : showimg.trim();
    }
}