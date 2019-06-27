package com.xjt.service.impl;

import com.xjt.dao.IOrdersMapper;
import com.xjt.model.Orders;
import com.xjt.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IOrderServiceImpl implements IOrderService {
    @Autowired
    private IOrdersMapper iOrdersMapper;
    @Override
    public List<Orders> getOrdersAndUserInfo() {
        return iOrdersMapper.getOrdersAndUserInfo();
    }
}
