package com.dzxz.common.response;

import lombok.ToString;

@ToString
public enum CommonCode implements ResultCode{

    SUCCESS(true,10000,"操作成功"),
    FAIL(false,11111,"操作失败");

    final boolean success;
    final int code;
    final String message;

    private CommonCode(boolean success,int code,String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
