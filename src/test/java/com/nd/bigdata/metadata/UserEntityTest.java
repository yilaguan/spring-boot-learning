package com.nd.bigdata.metadata;

//import com.nd.bigdata.dao.metadata.User;
import com.nd.bigdata.SpringLearningApplication;
import com.nd.bigdata.dao.metadata.UserEntity;
import com.nd.bigdata.dao.metadata.UserEntityRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-18
 * Time: 下午1:44
 * AuthorEmail: zhangliangxgd@163.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringLearningApplication.class)
public class UserEntityTest {
    private static final Log log = LogFactory.getLog(UserEntityTest.class);

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Test
    public void test() throws Exception{
        UserEntity user = userEntityRepository.findByUserId(Long.parseLong("1"));
        if (user != null) {
            log.info("user is not null");
        } else{
            log.info("user is null");
        }
        userEntityRepository.save(new UserEntity(Long.parseLong("6"), "wangwu", 27, "male", 1));
//        log.info("userId is: "+ user.getUserId());
//        log.info("name is : " + user.getName());
//        log.info("age si : " + user.getAge());
    }
}
