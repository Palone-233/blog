package com.hzp.blog.service;

import com.hzp.blog.model.Article;
import com.hzp.blog.model.User;



import java.util.List;

/**
 * @author hzp
 * @date 2019/11/9 22:01
 * @description
 */


public interface ArticleIService {
    List<Article> showbyUser(User user);

    boolean save(Article article);

    boolean update(Article article);

    boolean delete(Article article);

    boolean save(int user_id, String user_name, String title, String content);

    List<Article> findbyUser(User user);

    boolean deletebyId(int id);

    List<Article> findall();

    Article findbyId(int id);
}
