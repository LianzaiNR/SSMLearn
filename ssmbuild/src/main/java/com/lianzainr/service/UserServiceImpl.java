package com.lianzainr.service;

import com.lianzainr.dao.UserMapper;
import com.lianzainr.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    //service调用DAO层
    private UserMapper userMapper;

    //提供set方法
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User queryIdUser(int id) {
        return userMapper.queryIdUser(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
