package com.sjh.feign.fallback;

import com.sjh.feign.AccountFeign;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Slf4j
public class AccountFeignFallBack implements AccountFeign {

    @Override
    public void takeOffBalance(Integer accountId, Long money) {
        log.error("账户服务异常");
    }
}
