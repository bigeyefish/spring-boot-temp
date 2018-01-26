package com.honeypotato.web;

import com.honeypotato.model.Result;
import com.honeypotato.util.ResultFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局 web
 * Created by sanyihwang on 2018/1/24.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("message", "特朗普说这个页面你不能进......");
        return "404.html";
    }

    @RequestMapping
    @ResponseBody
    public Result error() {
        return ResultFactory.error(404);
    }
}
