package com.qing.dubbo.service;

import com.github.pagehelper.PageInfo;
import com.qing.dubbo.domain.UserDomain;

/**
 * Created by liuq on 2018/6/2.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);

}
