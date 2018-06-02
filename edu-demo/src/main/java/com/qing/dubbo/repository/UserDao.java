package com.qing.dubbo.repository;

import com.qing.dubbo.domain.UserDomain;

import java.util.List;

/**
 * Created by liuq on 2018/6/2.
 */
public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();

}
