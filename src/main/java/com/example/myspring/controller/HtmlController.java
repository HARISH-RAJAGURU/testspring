package com.example.myspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/show")
    public String data(){
         return "data";
    }
    
}
