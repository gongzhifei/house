package com.gzf.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gongzhifei
 */
@Controller
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "/login";
    }

}
