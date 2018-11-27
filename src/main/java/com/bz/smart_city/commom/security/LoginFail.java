package com.bz.smart_city.commom.security;

import com.bz.smart_city.commom.model.AjaxMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登陆失败处理器
 */
@Component("fail")
public class LoginFail implements AuthenticationFailureHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private AjaxMessage ajaxMessage;

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        logger.info("登陆失败！");
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        ObjectMapper objectMapper = new ObjectMapper();
        if (e instanceof UsernameNotFoundException || e instanceof BadCredentialsException) {
            ajaxMessage.setMsg(-902, "用户名或密码错误");
            httpServletResponse.getWriter().write(objectMapper.writeValueAsString(ajaxMessage));
        } else {
            ajaxMessage.setMsg(-1, e.getMessage());
            httpServletResponse.getWriter().write(objectMapper.writeValueAsString(ajaxMessage));
        }
    }
}
