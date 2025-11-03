package com.samlinux.myapp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController{
    public String read(){
        return "God is greatest";
    }
}