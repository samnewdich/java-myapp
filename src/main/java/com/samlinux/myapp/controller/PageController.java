package com.samlinux.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        // Forward internally to index.html in the static folder
        return "forward:/index.html";
    }

    @GetMapping("/login")
    public String login() {
        // Forward internally to login.html in the static folder
        return "forward:/login.html";
    }
}
