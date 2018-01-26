package com.honeypotato.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制类
 * Created by sanyihwang on 2018/1/24.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() throws Exception {
        throw new Exception("发生错误");
    }

}
