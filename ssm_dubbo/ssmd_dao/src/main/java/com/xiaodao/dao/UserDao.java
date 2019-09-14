package com.xiaodao.dao;

import com.xiaodao.domain.User;
import com.xiaodao.domain.UserExample;
import java.util.List;

/**
 *  UserDao
 
 哈哈哈哈哈哈哈哈哈哈哈
 */
public interface UserDao {

    int deleteByPrimaryKey(Integer userId);

    int insert(User user);

    int insertSelective(User user);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
}