package com.xjt.dao;

import com.xjt.model.Orders;

import java.util.List;

public interface IOrdersMapper {
    public List<Orders> getOrdersAndUserInfo();
}
