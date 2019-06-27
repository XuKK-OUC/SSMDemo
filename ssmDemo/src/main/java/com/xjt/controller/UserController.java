package com.xjt.controller;

import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
    @RequestMapping("/getOne")
    public String getUserById(Model model) throws Exception {
        User user = userService.selectUser(1);
        model.addAttribute("user",user);
        return "user";  //返回逻辑视图名
    }



}