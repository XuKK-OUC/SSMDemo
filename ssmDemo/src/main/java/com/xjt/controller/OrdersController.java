package com.xjt.controller;

import com.xjt.model.Orders;
import com.xjt.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private IOrderService iOrderService;
    @RequestMapping("/hel")
    public List<Orders> getOrdersAndUserInfo(){
        return iOrderService.getOrdersAndUserInfo();
    }
}
