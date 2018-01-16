package com.nd.bigdata;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-16
 * Time: 下午3:51
 * AuthorEmail: zhangliangxgd@163.com
 */

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class, args);
    }
}
