package com.ums.bean;

import javax.validation.constraints.Pattern;

public class User {
    private Long id;

    private Long parentid;

    private String openid;
    
	@Pattern(regexp = "^[a-zA-Z0-9_-]{6,16}$", message = "用户名必须是6-16位英文和数字的组合")
    private String username;
	@Pattern(regexp = "^[a-zA-Z\\d_]{6,}$", message = "密码至少由6位字符组成")
    private String password;   //

    private String truename;

    private Integer sex;

    private Integer age;

    private String address;

	@Pattern(regexp = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$", message = "邮箱格式不正确")
    private String email;

    private String qq;

    private String homephone;

    @Pattern(regexp = "^[1][3,4,5,7,8][0-9]{9}$", message = "请输入正确的手机号")
    private String telphone;

    private String usercardid;

    private Integer userstatus;

    private String state;

    private String lastlogintime;

    private String createTime;

    private Integer isdelete;

    private Long authorityid;

    private Long userroleid;

    private String headimg;

    private Double money;

    private Integer integral;

    private Byte isactive;

    private String validatecode;

    private String outdate;

    private Byte isbinding;

    private String phoneverificationcode;

    private String city;

    private String birthday;

    private String grade;

    private String school;

    private String usernickname;

    private String lastlogintimeshort;

    private Integer alwayslogin;

    private String personintr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone == null ? null : homephone.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getUsercardid() {
        return usercardid;
    }

    public void setUsercardid(String usercardid) {
        this.usercardid = usercardid == null ? null : usercardid.trim();
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Long getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(Long authorityid) {
        this.authorityid = authorityid;
    }

    public Long getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Long userroleid) {
        this.userroleid = userroleid;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Byte getIsactive() {
        return isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public String getValidatecode() {
        return validatecode;
    }

    public void setValidatecode(String validatecode) {
        this.validatecode = validatecode == null ? null : validatecode.trim();
    }

    public String getOutdate() {
        return outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate == null ? null : outdate.trim();
    }

    public Byte getIsbinding() {
        return isbinding;
    }

    public void setIsbinding(Byte isbinding) {
        this.isbinding = isbinding;
    }

    public String getPhoneverificationcode() {
        return phoneverificationcode;
    }

    public void setPhoneverificationcode(String phoneverificationcode) {
        this.phoneverificationcode = phoneverificationcode == null ? null : phoneverificationcode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname == null ? null : usernickname.trim();
    }

    public String getLastlogintimeshort() {
        return lastlogintimeshort;
    }

    public void setLastlogintimeshort(String lastlogintimeshort) {
        this.lastlogintimeshort = lastlogintimeshort == null ? null : lastlogintimeshort.trim();
    }

    public Integer getAlwayslogin() {
        return alwayslogin;
    }

    public void setAlwayslogin(Integer alwayslogin) {
        this.alwayslogin = alwayslogin;
    }

    public String getPersonintr() {
        return personintr;
    }

    public void setPersonintr(String personintr) {
        this.personintr = personintr == null ? null : personintr.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", parentid=" + parentid + ", openid=" + openid + ", username=" + username
				+ ", password=" + password + ", truename=" + truename + ", sex=" + sex + ", age=" + age + ", address="
				+ address + ", email=" + email + ", qq=" + qq + ", homephone=" + homephone + ", telphone=" + telphone
				+ ", usercardid=" + usercardid + ", userstatus=" + userstatus + ", state=" + state + ", lastlogintime="
				+ lastlogintime + ", createTime=" + createTime + ", isdelete=" + isdelete + ", authorityid="
				+ authorityid + ", userroleid=" + userroleid + ", headimg=" + headimg + ", money=" + money
				+ ", integral=" + integral + ", isactive=" + isactive + ", validatecode=" + validatecode + ", outdate="
				+ outdate + ", isbinding=" + isbinding + ", phoneverificationcode=" + phoneverificationcode + ", city="
				+ city + ", birthday=" + birthday + ", grade=" + grade + ", school=" + school + ", usernickname="
				+ usernickname + ", lastlogintimeshort=" + lastlogintimeshort + ", alwayslogin=" + alwayslogin
				+ ", personintr=" + personintr + "]";
	}
}