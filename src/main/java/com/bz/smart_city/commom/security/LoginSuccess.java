package com.bz.smart_city.commom.security;

import com.bz.smart_city.commom.model.AjaxMessage;
import com.bz.smart_city.commom.util.JwtTokenUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登陆成功处理器
 */
@Component("success")
public class LoginSuccess implements AuthenticationSuccessHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private AjaxMessage ajaxMessage;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    /**
     * //有效期
     */
    @Value("${jwt.expiration}")
    private Long expiration;


    //@Autowired
    //private ObjectMapper objectMapper;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        logger.info("登陆成功！");
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        ObjectMapper objectMapper = new ObjectMapper();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String jwtToken = jwtTokenUtil.generateToken(userDetails);
        jwtTokenUtil.setExpire(jwtToken,userDetails.getUsername(),expiration+100000);

        ajaxMessage.setMsg(1, "success！", jwtToken);
        //httpServletResponse.getWriter().write(objectMapper.writeValueAsString(authentication));
        httpServletResponse.getWriter().write(objectMapper.writeValueAsString(ajaxMessage));
    }
}
