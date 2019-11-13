package com.hzp.blog;

import com.hzp.blog.mapper.ArticleMapper;
import com.hzp.blog.model.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author hzp
 * @date 2019/11/12 14:38
 * @description
 */
public class ArticleTest {
        @Autowired
        ArticleMapper articleMapper;
        @Test
       public   void  article(){

            boolean deleteall = articleMapper.deleteall();
            System.out.println(deleteall);
        }

}
