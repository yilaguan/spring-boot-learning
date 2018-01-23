package com.nd.bigdata.dao.metadata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 上午11:56
 * AuthorEmail: zhangliangxgd@163.com
 */
public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{
    UserEntity findByUserId(Long userid);
    UserEntity findByNameAndAge(String name, Integer age);
    List<UserEntity> findAll();
}
