package com.docker.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangsy
 * @desc :
 * @date 2020/8/4 14:18
 */
@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo(){
        return "hello word!";
    }
}
