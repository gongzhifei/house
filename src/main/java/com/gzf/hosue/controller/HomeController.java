package com.gzf.hosue.controller;

import com.gzf.hosue.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GFZ
 */
@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/get")
    public ApiResponse get(){
        return ApiResponse.ofMessage(200,"成功了");
    }

}
