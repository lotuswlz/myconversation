package com.thoughtworks.cathywu.controller;

import com.thoughtworks.cathywu.util.CookieUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(value="loginSubmit", method = RequestMethod.POST)
    public String loginSubmit(HttpServletRequest req, HttpServletResponse resp) {
        String userName = req.getParameter("userName");
        CookieUtil.saveCookie(resp, "username", userName, 3600*24);
        return "conversation";
    }
}
