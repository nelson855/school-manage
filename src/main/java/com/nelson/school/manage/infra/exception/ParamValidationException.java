package com.nelson.school.manage.infra.exception;

/**
 * @author nelson
 * @Desc 参数校验异常
 * @date 2021/3/29 8:50 下午
 */
public class ParamValidationException extends RuntimeException {

    public ParamValidationException() {
        super();
    }

    public ParamValidationException(String s) {
        super(s);
    }

    public ParamValidationException(String s, Throwable t) {
        super(s, t);
    }

    public ParamValidationException(Throwable t) {
        super(t);
    }
}
