package com.xiaodao.userservice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaodao.dao.UserDao;
import com.xiaodao.domain.User;
import com.xiaodao.domain.UserExample;
import com.xiaodao.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectByExample(UserExample example) {
        System.out.println("this is UserServiceImpl selectByExample");
        return userDao.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userDao.deleteByPrimaryKey(userId);
    }

    @Override
    public int insertSelective(User user) {
        return userDao.insertSelective(user);
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

}
