package com.hzp.blog.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hzp
 * @date 2019/11/6 16:31
 * @description
 */
@Controller
public class Hello {
    @RequestMapping("/")
    public String hello() {
        return "redirect:/show";
    }
}
