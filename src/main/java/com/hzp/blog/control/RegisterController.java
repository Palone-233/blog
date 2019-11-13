package com.hzp.blog.control;

import com.hzp.blog.model.User;
import com.hzp.blog.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author hzp
 * @date 2019/11/9 21:15
 * @description
 */
@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @RequestMapping("/toregister")
    public String toregister() {
        return "register";
    }

    @RequestMapping("/register")

    public String register(HttpSession httpSession, @RequestParam("username") String username, @RequestParam("password") String password) {

        User user = userService.findbyUsername(username);
        if (user == null) {
            user = userService.register(username, password);
            httpSession.setAttribute("User", user);
            return "redirect:/showall";
        } else {
            return "register";
        }

    }
}
