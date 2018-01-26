package com.honeypotato.interceptor;

import com.honeypotato.model.Result;
import com.honeypotato.util.ResultFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 * Created by sanyihwang on 2018/1/24.
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(HttpServletRequest req, Exception e) {
        System.out.println(e.getMessage());
        System.out.println(req.getRequestURL());
        return ResultFactory.error(e.getMessage());
    }
}
