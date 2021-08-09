package com.lianzainr.service;

import com.lianzainr.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    User queryIdUser(int id);

    List<User> queryAllUser();
}
