package com.sjh.service.impl;

import com.sjh.mapper.AccountMapper;
import com.sjh.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public int takeOffBalance(int accountId, Long money) {
        return accountMapper.takeOffBalance(accountId, money);
    }
}
