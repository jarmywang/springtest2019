package com.wang.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        Map<Long, String> users =  Collections.synchronizedMap(new HashMap<>());
        return "hello pring!!\nSystem.currentTimeMillis()= " + System.currentTimeMillis() + "\nby:" + getClass().getName();
    }

}
