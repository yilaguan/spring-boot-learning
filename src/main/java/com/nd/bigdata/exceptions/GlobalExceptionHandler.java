package com.nd.bigdata.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 上午10:01
 * AuthorEmail: zhangliangxgd@163.com
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorMessage<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception{
        ErrorMessage<String> errorMessage = new ErrorMessage<String>();
        errorMessage.setTimestamp(System.currentTimeMillis());
        errorMessage.setMessage(e.getMessage());
        errorMessage.setCode(ErrorMessage.getERROR());
        errorMessage.setData("Some data");
        errorMessage.setUrl(req.getRequestURL().toString());
        return errorMessage;
    }
}
