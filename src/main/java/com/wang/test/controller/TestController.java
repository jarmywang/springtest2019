package com.wang.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "hello spring!!\nSystem.currentTimeMillis()= " + System.currentTimeMillis() + "\nby:" + getClass().getName();
    }

}
