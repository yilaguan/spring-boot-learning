package com.nd.bigdata.dao.metadata;

import com.nd.bigdata.models.User;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 上午11:51
 * AuthorEmail: zhangliangxgd@163.com
 */

@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AGE", nullable = false)
    private int age;

    @Column(name = "GENDER", nullable = false)
    private String gender;

    @Column(name = "DEPARTMENT_ID", nullable = false)
    private long departmentId;

    public Long getUserId() {
        return userId;
    }

    public UserEntity(){}

    public UserEntity(Long userId, String name, int age, String gender, int departmentId){
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.departmentId = departmentId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
