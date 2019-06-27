package com.xjt.service;

import com.xjt.model.Orders;

import java.util.List;

public interface IOrderService {
    public List<Orders> getOrdersAndUserInfo();
}
