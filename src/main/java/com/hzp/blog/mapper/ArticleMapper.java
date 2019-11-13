package com.hzp.blog.mapper;

import com.hzp.blog.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author hzp
 * @date 2019/11/9 21:44
 * @description
 */
@Mapper
@Repository
public interface ArticleMapper {
    public boolean insert(Article article);

    public Article findbyId(int id);

    public List<Article> findbyUserId(int user_id);

    public boolean deletebyId(int id);

    public boolean deletebyUserId(int user_id);

    public boolean deleteall();

    public boolean update(Article article);

    List<Article> findall();
}
