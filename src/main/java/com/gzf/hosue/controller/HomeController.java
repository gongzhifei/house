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

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","哈哈神");
        return "index";
    }

    @GetMapping("/get")
    public ApiResponse get(){
        return ApiResponse.ofMessage(200,"成功了");
    }

}
