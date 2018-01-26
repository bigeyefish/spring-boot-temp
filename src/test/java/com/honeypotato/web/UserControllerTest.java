package com.honeypotato.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

/**
 * UserController 测试用例
 * Created by sanyihwang on 2018/1/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTest {

    private MockMvc mvc;
    private RequestBuilder request;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void getUserList() throws Exception {
        request = get("/users/");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
    }

    @Test
    public void postUser() throws Exception {
        request = post("/users/").param("id", "1").param("name", "测试大师").param("age", "20");
        mvc.perform(request).andExpect(content().string(equalTo("success")));
    }

    @Test
    public void getUser() throws Exception {
        this.postUser();
        request = get("/users/");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));
    }

    @Test
    public void putUser() throws Exception {
        this.postUser();
        request = put("/users/1").param("name", "测试终极大师").param("age", "30");
        mvc.perform(request).andExpect(content().string(equalTo("success")));

        request = get("/users/1");
        mvc.perform(request).andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));
    }

    @Test
    public void deleteUser() throws Exception {
        this.postUser();
        request = delete("/users/1");
        mvc.perform(request).andExpect(content().string(equalTo("success")));

        request = get("/users/");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
    }

}