package jp.co.saisk.dao;

import jp.co.saisk.entity.User;

public interface UserDao {

    //根据用户查询用户
    User findByUserName(String username);

    //保存用户信息
    void save(User user);

}
