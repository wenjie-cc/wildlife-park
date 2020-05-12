package com.wildlife.park.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaoling
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum StatusCode {
    /**
     * 成功
     */
    OK(200, "成功"),
    /**
     * 业务错误
     */
    ERROR(400, "服务端业务错误"),
    /**
     * 用户未授权错误
     */
    UNAUTHORIZED(401, "用户未授权"),
    /**
     * 用户未授权错误
     */
    FORBIDDEN(403, "访问被拒绝"),
    /**
     * 未知错误
     */
    UNKNOWN(9999, "未知错误");

    private final int code;
    private final String title;
}