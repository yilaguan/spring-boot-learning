package com.nd.bigdata.controller;

import com.nd.bigdata.entity.StudentEntity;
import com.nd.bigdata.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午3:42
 * AuthorEmail: zhangliangxgd@163.com
 */

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    private StudentService studentService;
    @RequestMapping(value = "/getUserByName/{name}", method = RequestMethod.GET)
    public StudentEntity getUserByName(@PathVariable String name) throws Exception{
        StudentEntity user=null;
        try {
            user=studentService.findStudentByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
