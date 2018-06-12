package com.xsj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    public ModelMap getResult(String key,Object value){
        ModelMap map = new ModelMap();
        map.put(key,value);
        return  map;
    }

}
