package com.nd.bigdata.controller;


import com.nd.bigdata.exceptions.MyException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    private static final Log log = LogFactory.getLog(HelloController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws Exception{
        return "hello, world!";
    }

    @RequestMapping(value = "/hello/errors/{errorIndex}", method = RequestMethod.GET)
    public String error(@PathVariable int errorIndex) throws Exception{
        if(errorIndex == 1){
            log.info("I am right!");
        } else{
            throw new Exception("发生错误");
        }
        return "正常结束";
    }

    @RequestMapping(value = "/hello/errors/jsons/{jsonId}", method = RequestMethod.GET)
    public String jsonError(@PathVariable(name = "jsonId") int jsonId) throws MyException{
        if(jsonId == 1){
            log.info("It is right json");
        } else{
            throw new MyException("json 发生错误");
        }
        return "正常结束json";
    }


    @RequestMapping(value = "/hello/errors/global", method = RequestMethod.POST)
    public String globalError(ModelMap map){
        map.addAttribute("host", "http://blog.zhangliangn.com");
        return "globalError";
    }
}
