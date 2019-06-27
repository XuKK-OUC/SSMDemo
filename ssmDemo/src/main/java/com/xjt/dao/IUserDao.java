package com.xjt.dao;

import com.xjt.model.User;
import com.xjt.model.UserAndOrderBean;

import java.util.List;

public interface IUserDao {
    User selectUser(long id);

    List<User> getAll();

    User getUserById(int id);

    int insertOne(User user);

    void update(User user);

    void deleteById(int id);

    // 一对多企业用法
    List<UserAndOrderBean> getUserAndOrderInfo();
    //一对多resultMap用法
    List<User> getUserAndOrderInfo2();

}
