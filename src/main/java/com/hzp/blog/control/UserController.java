package com.hzp.blog.control;

import com.hzp.blog.model.User;
import com.hzp.blog.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author hzp
 * @date 2019/11/13 15:53
 * @description
 */
@Controller

public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/toupdateUser")
    public String toupdateUser() {
        return "updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(HttpSession httpSession, @RequestParam("username") String username, @RequestParam("newpassword") String password1, @RequestParam("newpassword2") String password2) {
        User user = (User) httpSession.getAttribute("User");
        if (user == null || user.getId() == 0) {
            return "redirect:/tologin";
        }
        if (!password1.equals(password2)) {
            return "updateUser";
        }
        user.setPassword(password1);
        user.setUsername(username);
        boolean update = userService.update(user);
        if (update) {
            httpSession.setAttribute("User", user);
            return "redirect:/showall";
        } else {
            return "updateUser";
        }

    }

}
