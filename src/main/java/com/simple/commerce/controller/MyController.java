package com.simple.commerce.controller;

import com.simple.commerce.domain.User;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "hello thyme leaaaaaaaaaaaaf@@!!");
        return "index";
    }

    @GetMapping("/login")
    public String loginUser() {
        return "/loginform";
    }
}
