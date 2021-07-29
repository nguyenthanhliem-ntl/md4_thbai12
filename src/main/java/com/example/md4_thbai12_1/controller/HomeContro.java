package com.example.md4_thbai12_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContro {
    @GetMapping("/")
    public String showIndex() {
        return "/index";
    }
}
