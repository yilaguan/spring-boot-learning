package com.nd.bigdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午3:32
 * AuthorEmail: zhangliangxgd@163.com
 */

@Entity
public class StudentEntity {
    /** 用户id */
    @Id
    @GeneratedValue
    private long id;
    /** 用户编号 */
    @Column(nullable = true)
    private String userNo;
    /** 用户名称 */
    @Column(nullable = true)
    private String userName;
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

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
