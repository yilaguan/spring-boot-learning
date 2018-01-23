package com.nd.bigdata.dao.metadata;

import com.nd.bigdata.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午3:35
 * AuthorEmail: zhangliangxgd@163.com
 */
public interface StudentDao extends JpaRepository<StudentEntity, Long> {

    StudentEntity findByName(String name);
}
