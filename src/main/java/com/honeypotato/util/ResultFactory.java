package com.honeypotato.util;

import com.honeypotato.model.Result;

/**
 * Created by Lenovo on 2017/10/15.
 */
public class ResultFactory {

    /**
     * 构建接口成功返回数据
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return ResultFactory.createResult(Constant.ResultCode.SUCCESS, data);
    }

    public static Result success() {
        return ResultFactory.success(null);
    }

    /**
     * 构建接口程序异常返回数据
     * @param data
     * @return
     */
    public static Result error(Object data) {
        return ResultFactory.createResult(Constant.ResultCode.ERROR, data);
    }

    public static Result error() {
        return ResultFactory.error(null);
    }

    /**
     * 构建接口返回数据
     * @param code 返回码
     * @param data 业务数据
     * @return
     */
    public static Result createResult(int code, Object data) {
        return new Result(code, Constant.codeMap.get(code), data);
    }

    public static Result createResult(int code) {
        return createResult(code, null);
    }
}
