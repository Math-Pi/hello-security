package com.cjm.hellosecurity.web;

/**
 * @Author CJM
 * @Date 2020/11/1  10:06
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "Hello Security!";
    }
}
