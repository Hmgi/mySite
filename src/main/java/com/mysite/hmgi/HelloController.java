package com.mysite.hmgi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;

@Controller
public class HelloController {
    @GetMapping("/hmgi")
    @ResponseBody
    public String hello(){
        return "124";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
