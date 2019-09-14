package com.xiaodao.userservice;

import com.xiaodao.domain.User;
import com.xiaodao.domain.UserExample;

import java.util.List;

public interface UserService {

    // 查询所有
    List<User> selectByExample(UserExample example);

    // 根据id查询
    User selectByPrimaryKey(Integer userId);

    // 根据id删除
    int deleteByPrimaryKey(Integer userId);

    // 添加
    int insertSelective(User user);

    // 修改
    int updateByPrimaryKeySelective(User user);


}
