package com.hzp.blog.blog.control;


import com.hzp.blog.blog.mapper.UserMapper;
import com.hzp.blog.blog.model.User;
import com.hzp.blog.blog.service.UserIService;
import com.hzp.blog.blog.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hzp
 * @date 2019/11/6 15:58
 * @description
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findbyID")
    @ResponseBody
    public User findByID() {

        return userService.findbyID(1);
    }

    @RequestMapping("/findall")
    @ResponseBody
    public List<User> findall() {
        return userService.findall();
    }


    @RequestMapping("/insert")
    @ResponseBody
    public User insert() {
        User user = new User("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        return userService.insert(user);
    }
}
