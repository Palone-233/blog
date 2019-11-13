package com.hzp.blog.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hzp
 * @date 2019/11/9 21:35
 * @description
 */
public class Article implements Serializable {
    private int id;
    private int user_id;
    private String user_name;

    private String title;

    private String content;
    private String date;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public Article(int id, int user_id, String user_name, String title, String content, String date) {
        this.id = id;
        this.user_id = user_id;
        this.user_name = user_name;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public Article(int user_id, String user_name, String title, String content, String date) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.title = title;
        this.content = content;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
