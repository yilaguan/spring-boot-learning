package com.nd.bigdata.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午3:32
 * AuthorEmail: zhangliangxgd@163.com
 */

@Entity
@Table(name = "STUDENT")
public class StudentEntity {
    /** 用户id */
    @Id
    @GeneratedValue
    private long id;
    /** 用户名称 */
    @Column(nullable = true, columnDefinition = "TEXT")
    private String name;
    /** 用户密码 */
//    @Column(nullable = true)
//    private String userPwd;
//    /** 用户盐值 */
//    @Column(nullable = true)
//    private String salt;
//    /** 用户状态 */
//    @Column(nullable = true)
//    private String userStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getUserPwd() {
//        return userPwd;
//    }
//
//    public void setUserPwd(String userPwd) {
//        this.userPwd = userPwd;
//    }
//
//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt;
//    }
//
//    public String getUserStatus() {
//        return userStatus;
//    }
//
//    public void setUserStatus(String userStatus) {
//        this.userStatus = userStatus;
//    }
}
