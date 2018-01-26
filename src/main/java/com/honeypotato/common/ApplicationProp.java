package com.honeypotato.common;

import org.springframework.stereotype.Component;

/**
 * 系统配置
 * Created by sanyihwang on 2018/1/24.
 */

@Component
public class ApplicationProp {

//    @Value("${system.env.test}")
    private boolean env;

    public boolean isEnv() {
        return env;
    }

    public void setEnv(boolean env) {
        this.env = env;
    }
}
