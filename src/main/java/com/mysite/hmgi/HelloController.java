package com.mysite.hmgi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;

@Controller
public class HelloController {
    @GetMapping
    @ResponseBody
    public String hello(){
        return "test";
    }
}
