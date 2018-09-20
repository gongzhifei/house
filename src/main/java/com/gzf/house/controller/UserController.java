package com.gzf.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gongzhifei
 */
@Controller
public class UserController {

    @GetMapping("/user/login")
    public String login(){
        return "user-login";
    }

    @GetMapping("/login/page")
    public String logins(){
        return "login";
    }

    @GetMapping("/loginchild")
    public String loginChild(){
        return "loginchild";
    }

//    @PostMapping("/login")
//    @ResponseBody
//    public String doLogin(){
//        System.out.println("123");
//        return "123";
//    }

}
