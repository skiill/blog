package com.xsj.blog.controller;

import com.xsj.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController{

    @Autowired
    CommentService commentService;

    @GetMapping("dianzang")
    public ModelMap dianzang(@PathVariable boolean dianzang,@PathVariable Integer cId){
        ModelMap map = new ModelMap();
        if (dianzang){
            boolean dianzang1 = commentService.dianzang(cId);
            if (dianzang1){
                map.put("isStart",dianzang1);
            }
        }
        map.put("error","Start failed");
        return getResult("data",map);
    }

    @PostMapping("editcomment")
    public ModelMap editComment(@PathVariable String content,
                                @PathVariable Integer bId,
                                @PathVariable Integer uId,
                                @PathVariable(required = false) Integer cId){
        ModelMap map = new ModelMap();
        //commentService.

        return getResult("data",map);
    }


}
