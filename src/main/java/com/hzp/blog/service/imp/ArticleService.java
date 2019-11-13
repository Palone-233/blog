package com.hzp.blog.service.imp;

import com.hzp.blog.mapper.ArticleMapper;
import com.hzp.blog.model.Article;
import com.hzp.blog.model.User;
import com.hzp.blog.service.ArticleIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author hzp
 * @date 2019/11/9 22:06
 * @description
 */
@Service
public class ArticleService implements ArticleIService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> findbyUser(User user) {
        return articleMapper.findbyUserId(user.getId());
    }

    @Override
    public boolean deletebyId(int id) {
        return articleMapper.deletebyId(id);
    }

    @Override
    public List<Article> showbyUser(User user) {

        return articleMapper.findbyUserId(user.getId());
    }

    @Override
    public boolean save(int user_id, String user_name, String title, String content) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Article article = new Article(user_id, user_name, title, content, format.format(date));

        return save(article);
    }

    @Override
    public boolean save(Article article) {
        return articleMapper.insert(article);
    }

    @Override
    public boolean update(Article article) {
        System.out.println(article);
        return articleMapper.update(article);
    }

    @Override
    public boolean delete(Article article) {
        int id = article.getId();
        return articleMapper.deletebyId(id);
    }

    @Override
    public Article findbyId(int id) {
        return articleMapper.findbyId(id);
    }

    @Override
    public List<Article> findall() {
        return articleMapper.findall();
    }
}
