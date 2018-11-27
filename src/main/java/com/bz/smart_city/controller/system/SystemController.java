package com.bz.smart_city.controller.system;

import com.bz.smart_city.commom.util.UserUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("system")
@Api(description = "系统管理")
public class SystemController {
    @PostMapping("user")
    @ApiOperation(value = "用户")
    public String user(){
        return UserUtil.getCurrentUser().getUsername();
    }

    @PostMapping("/user/add")
    @ApiOperation(value = "添加用户")
    public String addUser(){
        return "addUser";
    }

    @PostMapping("/user/delect")
    @ApiOperation(value = "删除用户")
    public String delectUser(){
        return "delectUser";
    }

    @PostMapping("menu")
    @ApiOperation(value = "菜点")
    public String menu(){
        return "menu";
    }

    @PostMapping("log")
    @ApiOperation(value = "日志")
    public String log(){
        return "log";
    }
}
