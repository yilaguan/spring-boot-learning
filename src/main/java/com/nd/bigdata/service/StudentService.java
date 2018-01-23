package com.nd.bigdata.service;

import com.nd.bigdata.entity.StudentEntity;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午3:38
 * AuthorEmail: zhangliangxgd@163.com
 */
public interface StudentService {
    StudentEntity findStudentByName(String name);
}
