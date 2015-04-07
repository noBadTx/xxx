package com.xemoo.exception;

/**
 * @ClassName: BusinessErrorCode
 * @Description: 业务逻辑错误码枚举类。错误码值范围区间[500,1000]
 * @author tangtianyun
 * @date 2013-12-4 下午07:04:06
 * @version 1.0
 */
public enum BusinessErrorCode implements ErrorCode
{
    /**
     * @Fields ARG_IS_NULL_OR_EMPTY : 必要参数为null或者空
     */
    ARGS_IS_NULL_OR_EMPTY(500),

    /**
     * @Fields ARGS_INVALID : 参数不合法
     */
    ARGS_INVALID(501),

    /**
     * @Fields TOO_MANY_PACKAGES : 包月包套餐数量过多
     */
    TOO_MANY_PACKAGES(502),

    /**
     * @Fields OUTER_INTERFACE_ERROR: 调用外部接口出错
     */
    OUTER_INTERFACE_ERROR(503),

    /**
     * @Fields GET_LOCK_ERROR: 没有获得锁
     */
    GET_LOCK_ERROR(504),

    /**
     * @Fields CREATE_ORDER_FAIL : 创建订单失败
     */
    CREATE_ORDER_FAIL(505),
    /**
     * @Fields INVALID_PKG_TYPE : 无效的套餐类型
     */
    INVALID_PKG_TYPE(506),

    /**
     * @Fields INVALID_PKG_TYPE : 订购数量过多
     */
    ORDER_MUNBER_ERROR(507),

    /**
     * @Fields INVALID_SERVICE_PERIOD : 无效的服务时间段
     */
    INVALID_SERVICE_PERIOD(508),

    /**
     * @Fields UNSUPPORTED_PKG_TYPE : 不支持的套餐类型
     */
    UNSUPPORTED_PKG_TYPE(509),

    /**
     * @Fields CANNOT_APPEND_BOOK : 当前不能添加图书
     */
    CANNOT_APPEND_BOOK(510),

    /**
     * @Fields CANNOT_REPLACE_BOOK : 当前不能替换图书
     */
    CANNOT_REPLACE_BOOK(511),

    /**
     * @Fields REPLACE_BOOK_NUM_NOT_EQ : 替换和被替换的图书数量不等
     */
    REPLACE_BOOK_NUM_NOT_EQ(512),

    /**
     * @Fields REPLACE_BOOK_ERR : 图书替换失败
     */
    REPLACE_BOOK_ERR(513),

    /**
     * @Fields REPLACE_BOOK_ERR : 服务配置流程未完成
     */
    ORDER_STEP_NOT_DONE(514),

    /**
     * @Fields STAFF_LICENSE_ERR : 服务员工总数有误
     */
    STAFF_LICENSE_ERR(515),

    /**
     * @Fields CONF_SAVE_FAIL : 配置信息保存失败
     */
    CONF_SAVE_FAIL(516),

    /**
     * @Fields INVALID_PHONE_NUM : 非法的手机号码
     */
    INVALID_PHONE_NUM(517),

    /**
     * @Fields THIRD_PARTY_SYS_ERR : 第三方系统错误
     */
    THIRD_PARTY_SYS_ERR(518),
    
    /**
     * @Fields QUERY_CUSTOM_TYPE_FAIL : 查询个性化服务类型错误
     */
    QUERY_CUSTOM_TYPE_FAIL(519),
    
    /**
     * @Fields QUERY_CUSTOM_TYPE_BY_ENTERPRISE_FAIL : 查询个性化服务类型错误
     */
    QUERY_CUSTOM_TYPE_BY_ENTERPRISE_FAIL(520),
    
    /**
     * @Fields UPDATE_CUSTOMSERVER_BY_ENTERPRISE_FAIL : 更新个性化服务异常
     */
    UPDATE_CUSTOMSERVER_BY_ENTERPRISE_FAIL(521),
    ;

    private int value;

    private BusinessErrorCode(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }
}
