package com.xsj.blog.controller;

import com.xsj.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController extends BaseController{
    @Autowired
    BlogService blogService;

    @GetMapping("/listblog")
    public ModelMap listBlogs(){
        ModelMap map = new ModelMap();

        return getResult("blogs",map);
    }
}
