package com.hzp.blog.service.imp;


import com.hzp.blog.mapper.UserMapper;
import com.hzp.blog.model.User;
import com.hzp.blog.service.UserIService;
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
    public boolean update(User user) {

        return userMapper.update(user);

    }

    @Override
    public User findbyUser(User user) {
        User realuser = userMapper.findUser(user);
        return realuser;
    }

    @Override
    public List<User> findall() {
        return userMapper.findall();
    }

    @Override
    public User insert(User user) {
        userMapper.insert(user);
        int id = userMapper.findLastId();
        return userMapper.findbyId(id);
    }

    @Override
    public boolean deletebyID(int id) {
        return userMapper.deletebyId(id);
    }

    @Override
    public User findbyID(int id) {

        return userMapper.findbyId(id);
    }

    @Override
    public User findbyUsername(String username) {
        User user = userMapper.findbyUsername(username);
        return user;
    }

    @Override
    public User register(String username, String password) {
        User user = new User(username, password);
        return insert(user);
    }

    @Override
    public boolean deleteall() {
        return userMapper.deleteall();
    }
}
