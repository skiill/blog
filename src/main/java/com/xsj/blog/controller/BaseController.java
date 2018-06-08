package com.xsj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class BaseController {

    public ModelMap getResult(String key,Object value){
        ModelMap map = new ModelMap();
        map.put(key,value);
        return  map;
    }

}
