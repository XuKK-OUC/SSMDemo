package com.xjt.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private int id;
    private String username;
    //需要注意时间类型的数据,当前台传来的数据为1996-2-26的字符串时,要映射为时间类型,修改其setter方法,见下
    private Date birthday;
    private int sex;
    private String address;

    /**
     * 一对多关联查询时,改造user表,其中包含order表的list集合
     */
    private List<Orders> orders;
    public User() {
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public User(int id, String username, Date birthday, int sex, String address) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
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

    public void setBirthday(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday;
        try {
            birthday = sdf.parse(str);
            this.birthday = birthday;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
