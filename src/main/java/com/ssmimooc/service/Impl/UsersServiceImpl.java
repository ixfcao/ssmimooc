package com.ssmimooc.service.Impl;

import com.ssmimooc.entity.Users;
import com.ssmimooc.mapping.UsersMapper;
import com.ssmimooc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper ;


    /*注册用户*/
    @Override
    public int Register(Users users) {

        return usersMapper.insert(users);
    }


}
