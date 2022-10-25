package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pansiheng on 2022/10/25.
 */
@RequestMapping("/myController")
@RestController
public class MyController {


    @GetMapping(value ="/getTest")
    public String getTest() {
        return "getTest success";
    }

    @PostMapping(value ="/postTest")
    public String postTest() {
        return "postTest success";
    }
}
