package com.xjt.model;

import java.util.Date;

//select u.id,u.username,u.birthday,u.sex,u.address,o.id as OID,o.number,o.createtime from user u,orders o where u.id=o.user_id
public class UserAndOrderBean {
    private int id;
    private String username;
    //需要注意时间类型的数据,当前台传来的数据为1996-2-26的字符串时,要映射为时间类型,修改其setter方法,见下
    private Date birthday;
    private int sex;
    private String address;
    private int oid;
    private String number;
    private Date createtime;

    public UserAndOrderBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public UserAndOrderBean(int id, String username, Date birthday, int sex, String address, int oid, String number, Date createtime) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.oid = oid;
        this.number = number;
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "UserAndOrderBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", oid=" + oid +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
