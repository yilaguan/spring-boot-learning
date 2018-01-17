package com.nd.bigdata.properties;


import com.nd.bigdata.controller.HelloController;
import com.nd.bigdata.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-17
 * Time: 下午10:36
 * AuthorEmail: zhangliangxgd@163.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTests {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new HelloController(), new UserController()).build();
    }

    @Test
    public void getHello() throws Exception{
        mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(content().string(equalTo("hello, world!")));
    }

    @Test
    public void testUserController() throws Exception{
        // 1、get查一下user列表，应该为空
        RequestBuilder requestBuilder = null;
        requestBuilder = get("/users/");
        mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));


        // 2、post提交一个user
        requestBuilder = post("/users/1")
                .param("id", "1")
                .param("name", "测试大师")
                .param("age", "20");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("success")));

        requestBuilder = get("/users/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));

        // 4、put修改id为1的user
        requestBuilder = put("/users/1")
                .param("name", "测试终极大师")
                .param("age", "30");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("success")));

        // 5、get一个id为1的user
        requestBuilder = get("/users/1");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));

        // 6、del删除id为1的user
        requestBuilder = delete("/users/1");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("success")));

        // 7、get查一下user列表，应该为空
        requestBuilder = get("/users/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));




}

}
