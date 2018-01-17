package com.nd.bigdata.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-17
 * Time: 下午9:44
 * AuthorEmail: zhangliangxgd@163.com
 */

@Component
public class BlogProperties {
    @Value("${com.nd.bigdata.blog.name}")
    private String name;

    @Value("${com.nd.bigdata.blog.title}")
    private String title;

    @Value("${com.nd.bigdata.blog.value}")
    private String value;
    @Value("${com.nd.bigdata.blog.number}")
    private Integer number;
    @Value("${com.nd.bigdata.blog.bignumber}")
    private Long bignumber;
    @Value("${com.nd.bigdata.blog.test1}")
    private Integer test1;
    @Value("${com.nd.bigdata.blog.test2}")
    private Integer test2;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getValue() {
        return value;
    }

    public Integer getNumber() {
        return number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public Integer getTest2() {
        return test2;
    }
}
