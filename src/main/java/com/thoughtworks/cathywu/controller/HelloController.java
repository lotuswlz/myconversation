package com.thoughtworks.cathywu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("main")
    public String toMain() {
        return "main";
    }
}
