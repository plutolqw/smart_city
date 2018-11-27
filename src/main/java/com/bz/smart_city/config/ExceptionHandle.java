package com.bz.smart_city.config;


import com.bz.smart_city.commom.exception.ApplicationException;
import com.bz.smart_city.commom.model.AjaxMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 统一异常处理
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {
    @Resource
    private AjaxMessage ajaxMessage;

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public AjaxMessage handler(Exception e) {
        if (e instanceof ApplicationException) {
            ApplicationException exception = (ApplicationException) e;
            ajaxMessage.setMsg(exception.getCode(), exception.getMessage());
            return ajaxMessage;
        } else {
            ajaxMessage.setMsg(-999, "系统错误");
            log.info("[系统异常] {}", e);
            return ajaxMessage;
        }
    }
}
