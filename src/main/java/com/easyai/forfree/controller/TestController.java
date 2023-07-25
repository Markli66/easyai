package com.easyai.forfree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 3:01
 * @ProjectName easyai
 */
@RestController
public class TestController {

    @GetMapping(value = "/helloworld")
    public String hello(){
        return "helloWorld";
    }
}
