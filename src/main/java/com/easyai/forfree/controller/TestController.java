package com.easyai.forfree.controller;

import com.easyai.forfree.common.Result;
import com.easyai.forfree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 3:01
 * @ProjectName easyai
 */
@RestController
@RequestMapping("/system")
public class TestController {
    @Autowired
    private UserService userService;

   @RequestMapping(method = RequestMethod.POST,value = "/login",name = "用户登录")
    public Result hello() {
        return Result.success(userService.list());
    }
}
