package com.hzp.blog.service;


import com.hzp.blog.model.User;

import java.util.List;

/**
 * @author hzp
 * @date 2019/11/6 13:13
 * @description
 */
public interface UserIService {

  public boolean deletebyID(int id);
    public User  findbyID(int id);
    public User insert(User user);
    List<User> findall();
    public boolean deleteall();
    User findbyUsername(String username);

    User register(String username, String password);
}
