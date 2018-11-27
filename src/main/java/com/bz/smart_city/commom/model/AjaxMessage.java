package com.bz.smart_city.commom.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Ajax信息
 *
 * @author lin
 */
@ApiModel("返回信息")
@Component
@Scope("prototype")
public class AjaxMessage<T> {

    @ApiModelProperty(value = "返回状态", position = 0)
    private int code;
    @ApiModelProperty(value = "返回信息", position = 1)
    private String msg;
    @ApiModelProperty(value = "返回内容", position = 2)
    private T data;


    public void setMsg(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }


}
