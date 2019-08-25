package com.yc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author an-ping
 * @date 2019/8/25
 */
@RestController
public class HelloController {

    @RequestMapping(value="/say.action")
    public String say(){
        return "hello world";
    }


    @RequestMapping(value="/print.action")
    public String print(){
        return "你好！！！就斤斤计较";
    }
}
