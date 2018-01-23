package com.nd.bigdata.dao.metadata;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 上午11:49
 * AuthorEmail: zhangliangxgd@163.com
 */

@Entity
@Table(name = "DEPARTMENT")
public class DepartmentEntity {

    @Id
    @GeneratedValue
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(nullable = false, columnDefinition="TEXT")
    private String name;

    public DepartmentEntity(){}

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
