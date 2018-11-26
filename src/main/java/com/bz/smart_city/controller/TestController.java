package com.bz.smart_city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("test")
public class TestController {

    @PostMapping("test")
    public String test(){
        return "hello";
    }
}
