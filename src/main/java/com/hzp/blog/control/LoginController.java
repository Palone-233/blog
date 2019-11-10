package com.hzp.blog.control;


import com.hzp.blog.model.User;
import com.hzp.blog.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hzp
 * @date 2019/11/6 15:58
 * @description
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String index(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("有人要登录" + username + " +" + password);
        User user = userService.findbyUsername(username);
        if (user != null) {
            System.out.println(user.getPassword());
            if (user.getPassword().equals(password)) {
                return "登录成功";
            } else {
                return "密码错误";
            }
        }
        return "用户不存在";
    }


}
