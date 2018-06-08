package com.xsj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/{page}")
    public String jumpPage(@PathVariable(name = "page") String page){
        return page;
    }


}
