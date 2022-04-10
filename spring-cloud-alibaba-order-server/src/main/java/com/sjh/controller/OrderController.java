package com.sjh.controller;

import com.sjh.model.Order;
import com.sjh.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/create")
    public String create() {
        Order order = new Order();
        order.setGoodsId(1);
        orderService.createOrder(order);
        return "成功";
    }
}
