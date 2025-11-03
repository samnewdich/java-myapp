package com.samlinux.myapp.controller;
import java.util.Map;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class ApiController{
    
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> data) {
        //TODO: process POST request
        return Map.of("response", "success");
    }
    
}