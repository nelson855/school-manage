package com.nelson.school.manage.share.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author nelson
 * @Desc common return object
 * @date 2021/3/29 10:11 下午
 */
@Getter
@Setter
public class ModelAndView<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    protected ModelAndView() {
    }

    protected ModelAndView(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ModelAndView<T> success(String message, T data) {
        return new ModelAndView<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> ModelAndView<T> success(T data) {
        return new ModelAndView<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> ModelAndView<T> failed(String message, T data) {
        return new ModelAndView<T>(ResultCode.FAILED.getCode(), message, data);
    }

    public static <T> ModelAndView<T> failed(T data) {
        return new ModelAndView<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), data);
    }

    public static <T> ModelAndView<T> failed(String message) {
        return new ModelAndView<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), null);
    }

}
