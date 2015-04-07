package com.xemoo.exception;

/**
 * @ClassName: ServiceException
 * @Description: 服务异常
 * @author tangtianyun
 * @date 2013-12-4 下午01:54:54
 * @version 1.0
 */
public class ServiceException extends RuntimeException
{

    /**
     * @Fields serialVersionUID : 序列化ID
     */
    private static final long serialVersionUID = -2262282572124745078L;

    /**
     * @Fields code : 异常码 对象
     */
    private ErrorCode code;

    public ServiceException(ErrorCode code, String message)
    {
        super(message);
        this.code = code;
    }

    public ServiceException(ErrorCode code, Throwable throwable)
    {
        super(throwable);
        this.code = code;
    }

    public ErrorCode getCode()
    {
        return code;
    }
}
