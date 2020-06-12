package com.ssmimooc.service.Impl;

import com.ssmimooc.entity.Users;
import com.ssmimooc.entity.UsersExample;
import com.ssmimooc.mapping.UsersMapper;
import com.ssmimooc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper ;


    /*注册用户*/
    @Override
    public int Register(Users users) {

        return usersMapper.insert(users);
    }

    @Override
    public boolean selectUsersByNamePwd(String uname, String pwd) {

        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andNicknameEqualTo(uname).andPasswordEqualTo(pwd);
        List<Users> users = usersMapper.selectByExample(usersExample);
        return users.size() > 0;
    }


}
