package com.xjt.service;

import com.xjt.model.User;
import com.xjt.model.UserAndOrderBean;

import java.util.List;

public interface IUserService {
    public User selectUser(long userId);
    public List<User>getAll();
    public User getUserById(int id);
    public int insertOne(User user);
    void update(User user);
    void deleteById(int id);
    List<UserAndOrderBean> getUserAndOrderInfo();
    List<User>getUserAndOrderInfo2();

}
