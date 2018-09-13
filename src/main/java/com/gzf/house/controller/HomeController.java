package com.gzf.house.controller;

import com.gzf.house.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/get")
    public ApiResponse get(){
        return ApiResponse.ofMessage(200,"成功了");
    }

}
