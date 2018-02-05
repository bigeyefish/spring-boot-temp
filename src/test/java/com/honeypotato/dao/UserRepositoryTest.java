package com.honeypotato.dao;

import com.honeypotato.HomeManagerApplication;
import com.honeypotato.model.jpa.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Lenovo on 2018/1/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HomeManagerApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByUserName() throws Exception {
        User user = userRepository.findByUserName("aaa");
    }
}