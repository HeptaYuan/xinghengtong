package com.dzxz.common.response;

/**
 * 返回包含三个基本数据：
 * 1. 是否成功
 * 2. 状态码
 * 3. 返回信息
 * 每个返回前端的数据必须包含这三个属性，所以将这三个属性抽象出来
 */
public interface ResultCode {

    // 是否成功
    boolean success();
    // 操作状态码
    int code();
    // 返回信息
    String message();

}
