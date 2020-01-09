package com.test.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "测试controller")
public class TestController {

    @ApiOperation("测试获取值")
    @GetMapping("/getAA")
    public String getTest() {
        return "This is a test";
    }

    @ApiOperation("测试新增接口")
    @GetMapping("/getBB")
    public String getTestBB() {
        return "This is a testBB";
    }
}
