package com.spider.kit.join.in.memory.bean;

import com.spider.kit.join.in.memory.annotaion.JoinInMemory;

import java.util.List;

/**
 * @Desc
 * @Author TangXianJun
 * @Date 2024/2/19
 * @Version 1.0.0
 */
public class User {
    private Long id;
    private String username;
    @JoinInMemory
    private List<Order> orders;
}
