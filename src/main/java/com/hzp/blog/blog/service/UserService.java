package com.hzp.blog.blog.service;


import com.hzp.blog.blog.mapper.UserMapper;
import com.hzp.blog.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hzp
 * @date 2019/11/6 13:16
 * @description
 */

@Service
public class UserService implements UserIService {
    @Autowired
    UserMapper userMapper;
    @Override
  public List<User> findall() {
      System.out.println("进入服务层");
        return userMapper.findall();
  }

    @Override
    public User insert(User user) {
        userMapper.insert(user);
        int id = userMapper.findLastId();
        return userMapper.findbyId(id);
    }


    @Override
    public User findbyID(int id) {


        return userMapper.findbyId(id);
    }
}
