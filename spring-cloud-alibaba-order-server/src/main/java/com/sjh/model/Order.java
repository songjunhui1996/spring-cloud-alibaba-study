package com.sjh.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Data
public class Order implements Serializable {

    private int id;

    private int goodsId;

    private int num;
}
