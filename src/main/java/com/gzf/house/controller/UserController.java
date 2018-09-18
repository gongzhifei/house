package com.gzf.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gongzhifei
 */
@Controller
public class UserController {

    @GetMapping("/login/page")
    public String login(){
        return "/login";
    }

}
