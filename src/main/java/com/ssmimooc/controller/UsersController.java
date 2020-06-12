package com.ssmimooc.controller;

import com.ssmimooc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("new",100);
        return modelAndView ;
    }

    /*注册*/
//    @RequestMapping("/Register")
//    public ModelAndView

    /*登录*/
    @CrossOrigin("*")
    @RequestMapping("/login")
    @ResponseBody
    public String Login(String uname, String pwd){
        boolean b = usersService.selectUsersByNamePwd(uname, pwd);
        if (b) {
            return "1";
        } else {
            return "2";
        }

    }
}
