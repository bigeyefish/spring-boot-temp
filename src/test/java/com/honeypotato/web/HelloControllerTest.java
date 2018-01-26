package com.honeypotato.web;

import com.honeypotato.HomeManagerApplication;
import com.honeypotato.common.ApplicationProp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by sanyihwang on 2018/1/24.
 */
@RunWith(SpringRunner.class)
// 使用MockServletContent 来构建一个空的 WebApplicationContext, 这样我们创建的 HelloController 就可以在@Before函数中创建并传递到MockMvcBuilders.standaloneSetup()函数中
@SpringBootTest(classes = { MockServletContext.class, HomeManagerApplication.class })
@WebAppConfiguration
public class HelloControllerTest {

    private MockMvc mvc;

    @Autowired
    private ApplicationProp applicationProp;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }

    public ApplicationProp getApplicationProp() {
        return applicationProp;
    }

    public void setApplicationProp(ApplicationProp applicationProp) {
        this.applicationProp = applicationProp;
    }
}