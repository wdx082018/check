package com.ynz.check.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/check")
public class CheckAotai {

    @Value("${aotai.status}")
    private Integer status;

    @RequestMapping(value = "/login")
    @ResponseBody
    public Object checkLogin() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", status);
        return result;
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object checkTest() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", status);
        return result;
    }
}