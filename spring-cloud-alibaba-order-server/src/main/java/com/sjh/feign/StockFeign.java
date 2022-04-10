package com.sjh.feign;

import com.sjh.feign.fallback.StockFeignFallBack;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@FeignClient(value = "stockServer", fallback = StockFeignFallBack.class)
public interface StockFeign {

    @PostMapping("/takeOffStock")
    void takeOffStock(@RequestParam("goodsId") String goodsId, @RequestParam("num") Integer num);
}
