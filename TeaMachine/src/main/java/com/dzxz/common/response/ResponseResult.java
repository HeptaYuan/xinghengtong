package com.dzxz.common.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseResult implements Response{

    // 是否成功
    boolean success = SUCCESS;
    // 操作代码
    int code = SUCCESS_CODE;
    // 返回信息
    String message;

    public ResponseResult(){
    }

    public ResponseResult(ResultCode resultCode) {
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static ResponseResult SUCCESS() {
        return new ResponseResult(CommonCode.SUCCESS);
    }

    public static ResponseResult FAIL() {
        return new ResponseResult(CommonCode.FAIL);
    }

}
