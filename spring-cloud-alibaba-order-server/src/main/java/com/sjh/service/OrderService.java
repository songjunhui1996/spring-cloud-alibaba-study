package com.sjh.service;

import com.sjh.model.Order;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
public interface OrderService {

    /**
     * 创建一个订单
     * @return
     */
    int createOrder(Order order);
}
