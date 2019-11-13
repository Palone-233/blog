package com.hzp.blog.control;


import com.hzp.blog.model.User;
import com.hzp.blog.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author hzp
 * @date 2019/11/6 15:58
 * @description
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/tologin")
    public String toLogin(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("User");
        if (user != null && user.getId() != 0) {
            return "redirect:/showall";
        }
        return "login";
    }

    @RequestMapping("/login")

    public String index(HttpSession httpSession, @RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User(username, password);
        User realuser = userService.findbyUser(user);
        if (realuser != null) {
            httpSession.setMaxInactiveInterval(3600);
            httpSession.setAttribute("User", realuser);
            return "redirect:/showall";
        }
        httpSession.setAttribute("User", user);
        return "login";
    }


}
