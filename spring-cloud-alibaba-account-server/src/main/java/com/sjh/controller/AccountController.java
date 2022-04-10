package com.sjh.controller;

import com.sjh.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/takeOffBalance")
    public String takeOffBalance(@RequestParam("accountId") Integer accountId, @RequestParam("money") Long money) {
        accountService.takeOffBalance(accountId, money);
        return "支付成功";
    }
}
