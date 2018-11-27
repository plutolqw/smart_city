package com.bz.smart_city.controller;

import com.bz.smart_city.commom.model.AjaxMessage;
import com.bz.smart_city.entity.UserEntity;
import com.bz.smart_city.service.UserEntityService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("test")
@Api(description = "测试")
public class TestController {

    @Autowired
    private AjaxMessage ajaxMessage;
    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("test")
    @ApiOperation(value = "test")
    public String test(){
        return "hello1";
    }

    @PostMapping("findUser")
    @ApiOperation(value = "获取用户")
    public AjaxMessage<UserEntity> findUser(
            @ApiParam(value = "用户id", required = false) @RequestParam(required = false) Integer id
    ){
        UserEntity userEntity = userEntityService.findUserById(id);
        ajaxMessage.setMsg(1, "success", userEntity);
        return ajaxMessage;
    }

    @PostMapping("findUserList")
    @ApiOperation(value = "获取用户列表")
    public AjaxMessage<UserEntity> findUserList(
            @ApiParam(value = "页数,非必传，默认第一页", required = false, defaultValue = "1") @RequestParam(required = false, defaultValue = "1") int pageNum,
            @ApiParam(value = "条数，非必传，默认15条", required = false, defaultValue = "15") @RequestParam(required = false, defaultValue = "15") int pageSize
    ){
        PageInfo<UserEntity> pageInfo = userEntityService.findUserList(pageNum, pageSize);
        ajaxMessage.setMsg(1, "success", pageInfo);
        return ajaxMessage;
    }
}
