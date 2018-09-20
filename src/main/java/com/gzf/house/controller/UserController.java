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

    @GetMapping("/login/page")
    public String login(){
        return "/login";
    }

//    @PostMapping("/login")
//    @ResponseBody
//    public String doLogin(){
//        System.out.println("123");
//        return "123";
//    }

}
