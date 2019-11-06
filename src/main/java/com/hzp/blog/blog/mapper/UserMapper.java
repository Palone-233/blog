package com.hzp.blog.blog.mapper;


import com.hzp.blog.blog.model.User;
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
    public void insert(User user);
    public void update(User user);
    public void deletebyId(int id);
    public User findbyId(int id);
    public List<User> findall();
    public int findLastId();

}
