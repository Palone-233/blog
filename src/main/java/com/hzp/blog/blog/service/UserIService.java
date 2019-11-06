package com.hzp.blog.blog.service;


import com.hzp.blog.blog.model.User;

import java.util.List;

/**
 * @author hzp
 * @date 2019/11/6 13:13
 * @description
 */
public interface UserIService {
      public User insert(User user);
//    public  User update(User user);
//    public boolean deletebyID(int id);
    public User  findbyID(int id);

    List<User> findall();
}
