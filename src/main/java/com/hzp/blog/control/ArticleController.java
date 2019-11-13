package com.hzp.blog.control;

import com.hzp.blog.model.Article;
import com.hzp.blog.model.User;
import com.hzp.blog.service.imp.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.thymeleaf.model.IModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author hzp
 * @date 2019/11/9 22:00
 * @description
 */
@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/write")

    public String write(@RequestParam("title") String title, @RequestParam("content") String content, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("User");

        int user_id = user.getId();
        String user_name = user.getUsername();
        if (articleService.save(user_id, user_name, title, content))
            return "redirect:/showall";
        return "redirect:/showall";
    }

    @RequestMapping("/showall")
    public String showall(HttpSession httpSession, Model IModel) {
        User user = (User) httpSession.getAttribute("User");
        if (user == null || user.getId() == 0) {
            return "login";
        }
        List<Article> articles = articleService.findbyUser(user);

        IModel.addAttribute("articles", articles);
        return "index";
    }

    @RequestMapping("/writeArticle")
    public String writerArticle() {
        return "/write";
    }

    @RequestMapping("/deleteArticle")
    public String deleteArticle(@RequestParam("id") int id) {
        articleService.deletebyId(id);
        return "redirect:/showall";
    }

    @RequestMapping("/toupdateArticle")
    public String toupdateArticle(@RequestParam("id") int id, Model model) {
        Article article = articleService.findbyId(id);
        model.addAttribute("article", article);
        return "updateArticle";
    }

    @RequestMapping("/update")
    public String updateArticle(Model model, @RequestParam("id") int id, @RequestParam("title") String title, @RequestParam("content") String content) {

        Article article = articleService.findbyId(id);
        article.setContent(content);
        article.setTitle(title);
        boolean update = articleService.update(article);
        if (update) {
            return "redirect:/showall";
        } else {
            return "redirect:/toupdateArticle?id=" + article.getId();
        }
    }

    @RequestMapping("/findbyId")
    public String findbyID(int id, Model model) {

        Article article = articleService.findbyId(id);

        model.addAttribute("article", article);
        return "read";
    }

    @RequestMapping("/show")
    public String show(Model model) {
        List<Article> articles = articleService.findall();
        model.addAttribute("articles", articles);
        return "hello";
    }
}
