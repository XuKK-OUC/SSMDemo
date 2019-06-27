package com.xjt.service.impl;

import com.xjt.dao.IUserDao;
import com.xjt.model.User;
import com.xjt.model.UserAndOrderBean;
import com.xjt.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;


    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public int insertOne(User user) {
        return userDao.insertOne(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public List<UserAndOrderBean> getUserAndOrderInfo() {
        return userDao.getUserAndOrderInfo();
    }

    @Override
    public List<User> getUserAndOrderInfo2() {
        return userDao.getUserAndOrderInfo2();
    }

}