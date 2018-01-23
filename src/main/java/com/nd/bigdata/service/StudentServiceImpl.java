package com.nd.bigdata.service;

import com.nd.bigdata.dao.metadata.StudentDao;
import com.nd.bigdata.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午3:39
 * AuthorEmail: zhangliangxgd@163.com
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public StudentEntity findStudentByName(String name){
        return studentDao.findByName(name);
    }
}
