package com.xemoo.exception;

/**
 * @ClassName: DBErrorCode
 * @Description: 数据库相关的错误码枚举类。错误码值范围区间[0,99]
 * @author tangtianyun
 * @date 2013-12-4 下午01:58:50
 * @version 1.0
 */
public enum DBErrorCode implements ErrorCode
{
    /**
     * @Fields UNKNOW_SQL_EX : 未知的 SQL异常
     */
    UNKNOW_SQL_EX(0);

    private int value;

    private DBErrorCode(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }
}
