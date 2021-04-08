package com.nelson.school.manage.infra.exception;

/**
 * @author nelson
 * @Desc 服务内部异常
 * @date 2021/3/29 8:52 下午
 */
public class ServiceException extends RuntimeException{

    public ServiceException() {
        super();
    }

    public ServiceException(String s) {
        super(s);
    }

    public ServiceException(String s, Throwable t) {
        super(s, t);
    }

    public ServiceException(Throwable t) {
        super(t);
    }
}
