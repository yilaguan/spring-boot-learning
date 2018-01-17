package com.nd.bigdata.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-17
 * Time: 下午9:15
 * AuthorEmail: zhangliangxgd@163.com
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hello, world!";
    }
}
