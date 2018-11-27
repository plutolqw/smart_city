package com.bz.smart_city.commom.model;

/**
 * 基础返回码，具体业务返回码可继承ResultCode
 *
 * @author lin
 */
public class ResultCode {

    public final static int SUCCESS = 1;// 成功

    // 通用错误以9开头

    // 未知错误
    public final static int ERROR = -999;
    // 应用级错误
    public final static int APPLICATION_ERROR = -900;
    // 参数验证错误
    public final static int VALIDATE_ERROR = -901;
    // 业务逻辑验证错误
    public final static int SERVICE_ERROR = -902;
    // 缓存访问错误
    public final static int CACHE_ERROR = -903;
    // 数据访问错误
    public final static int DAO_ERROR = -904;
    // 数据访问错误
    public final static int TOKEN_ERROR = -902;
}
