package com.sjh.service.impl;

import com.sjh.feign.AccountFeign;
import com.sjh.mapper.OrderMapper;
import com.sjh.model.Order;
import com.sjh.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Resource
    private AccountFeign accountFeign;

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int createOrder(Order order) {
        orderMapper.createOrder(order);
        accountFeign.takeOffBalance(1, 10L);
        return 1;
    }
}
