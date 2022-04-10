package com.sjh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 宋俊辉
 * @date 2022/4/9 0009
 */
@RestController
@RequestMapping("/nocos-pay")
public class NocosController {

    @RequestMapping("/index")
    public String index() {
        return "这里是注册到nacos的支付服务";
    }
}
