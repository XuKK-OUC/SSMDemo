package com.xjt.model;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private int id;
    private int userId;
    private String number;
    private Date createtime;
    private String note;

    /**
     * 一对一查询,一个订单只对应一个用户
     */
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders() {
    }

    public Orders(int id, int userId, String number, Date createtime, String note) {
        this.id = id;
        this.userId = userId;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}
