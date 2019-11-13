package com.hzp.blog.mapper;


import com.hzp.blog.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hzp
 * @date 2019/11/6 12:29
 * @description
 */
@Mapper
@Repository
public interface UserMapper {
    public User findbyUsername(String username);

    public boolean insert(User user);
    public boolean update(User user);
    public boolean deletebyId(int id);
    public boolean deleteall();
    public User findbyId(int id);
    public List<User> findall();
    public int findLastId();


    public User findUser(User user);
}
