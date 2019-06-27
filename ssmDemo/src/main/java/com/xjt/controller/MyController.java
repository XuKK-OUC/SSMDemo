package com.xjt.controller;

import com.xjt.model.User;
import com.xjt.model.UserAndOrderBean;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MyController {
    @Autowired
    private IUserService userService;  //注意,spring mvc这里使用的代理,必须使用接口


    /**
     * 得到所有用户信息
     * @return
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public  List<User> getAll(){
        List<User> lists = userService.getAll();
        for(User u:lists){
            System.out.println(u);
        }
        return userService.getAll();
    }

    /**
     * 根据用户id得到一个用户的信息
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    /**
     * 添加一个用户的信息
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void getUserById(@RequestBody User user){
        int i = userService.insertOne(user);
        System.out.println("插入方法执行完毕");
        System.out.println(user.getId());
    }
    /**
     * 更新一个用户的信息
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody User user){
        userService.update(user);
        System.out.println("更新方法执行完毕");
    }
    /**
     * 根据id删除一个用户的信息
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public void update(@RequestParam  int id){
        userService.deleteById(id);
        System.out.println("删除方法执行完毕");
    }
    /**
     * 得到用户表及其订单信息1
     */
    @RequestMapping(value="/userandorderinfo",method = RequestMethod.GET)
    public  List<UserAndOrderBean>userandorderinfo(){
        System.out.println("hello");
        List<UserAndOrderBean> userAndOrderInfos = userService.getUserAndOrderInfo();
        for(UserAndOrderBean s:userAndOrderInfos){
            System.out.println(s);
        }
        return userAndOrderInfos;
    }/**
     * 得到用户表及其订单信息2
     */
    @RequestMapping(value="/userandorderinfo2",method = RequestMethod.GET)
    public  List<User>userandorderinfo2(){
        System.out.println("得到用户表及其订单信息2");
        List<User> userAndOrderInfos = userService.getUserAndOrderInfo2();
        for(User s:userAndOrderInfos){
            System.out.println(s);
        }
        return userAndOrderInfos;
    }
}
