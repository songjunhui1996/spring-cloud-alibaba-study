package com.sjh.feign.fallback;

import com.sjh.feign.StockFeign;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Slf4j
public class StockFeignFallBack implements StockFeign {

    @Override
    public void takeOffStock(String goodsId, Integer num) {
        log.error("库存服务异常");
    }
}
