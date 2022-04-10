package com.sjh.mapper;

import com.sjh.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * 订单mapper
 *
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Mapper
public interface OrderMapper {

    /**
     * 创建一个订单
     * @param order
     * @return
     */
    int createOrder(@Param("order") Order order);
}
