package com.sjh.feign;

import com.sjh.feign.fallback.AccountFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@FeignClient(value = "account-server", fallback = AccountFeignFallBack.class)
public interface AccountFeign {

    @PostMapping("/account/takeOffBalance")
    void takeOffBalance(@RequestParam("accountId") Integer accountId, @RequestParam("money") Long money);
}
