package com.nd.bigdata.properties;

import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-17
 * Time: 下午9:48
 * AuthorEmail: zhangliangxgd@163.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BlogPropertiesTests {

    private static final Log log = LogFactory.getLog(BlogPropertiesTests.class);

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getHello() throws Exception{
        Assert.assertEquals(blogProperties.getName(), "Dwayne Glenn");
        Assert.assertEquals(blogProperties.getTitle(), "SpringBootLearning");
        log.info("随机数测试输出：");
        log.info("随机字符串 : " + blogProperties.getValue());
        log.info("随机int : " + blogProperties.getNumber());
        log.info("随机long : " + blogProperties.getBignumber());
        log.info("随机10以下 : " + blogProperties.getTest1());
        log.info("随机10-20 : " + blogProperties.getTest2());

    }
}
