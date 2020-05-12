package com.wildlife.park.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yan
 * @desc CommonResult
 * @date 2020/4/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private Long total;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, 0L, null);
    }

    public static <T> CommonResult<T> of(int code, String message, T data, Long total) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        result.setTotal(total);

        return result;
    }

    public static CommonResult success() {
        return success(null);
    }

    public static <T> CommonResult<T> success(T data) {
        return success(data, null);
    }

    public static <T> CommonResult<T> success(T data, Long total) {
        return CommonResult.of(StatusCode.OK.getCode(), null, data, total);
    }

    public static CommonResult<Object> error(String message) {
        return error(StatusCode.ERROR, message);
    }

    private static CommonResult<Object> error(StatusCode code, String message) {
        return CommonResult.of(code.getCode(), message == null ? code.getTitle() : message, null, null);
    }

    public static CommonResult<Object> unknown(String message) {
        return error(StatusCode.UNKNOWN, message);
    }

    public static CommonResult<Object> unauthorized() {
        return error(StatusCode.UNAUTHORIZED, null);
    }

    public static CommonResult<Object> forbidden() {
        return error(StatusCode.FORBIDDEN, null);
    }
}
