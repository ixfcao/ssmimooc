package com.ssmimooc.service;

import com.ssmimooc.entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {


    /*注册用户*/
    int Register(Users users);

}
