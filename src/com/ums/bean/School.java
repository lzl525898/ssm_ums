package com.ums.bean;

import java.util.Date;

public class School {
    private Long id;

    private String province;

    private String city;

    private String area;

    private String name;

    private Date createtime;

    private Date updatetime;
    
    private String allName;
    
    public String getAllName() {
    	String province = this.getProvince();
		if ("北京市".equals(this.getProvince()) || 
		    "天津市".equals(this.getProvince()) || 
			"上海市".equals(this.getProvince()) || 
			"重庆市".equals(this.getProvince()) ) {
			province = "";
		} 
		allName = province + getCity() + getArea() + getName();
		return allName;
	}

	public void setAllName(String allName) {
		this.allName = allName;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}