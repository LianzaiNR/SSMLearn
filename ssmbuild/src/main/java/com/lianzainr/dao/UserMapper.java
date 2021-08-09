package com.lianzainr.dao;

import com.lianzainr.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    int deleteUser(@Param("uID") int id);

    int updateUser(User user);

    User queryIdUser(@Param("uID") int id);

    List<User> queryAllUser();
}
