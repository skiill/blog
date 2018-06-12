package com.xsj.blog.service.impl;

import com.xsj.blog.dao.CommentMapper;
import com.xsj.blog.model.Comment;
import com.xsj.blog.service.CommentService;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    /**
     * 评论点赞方法
     * @param
     * @param cId 评论id
     * @return
     */
    @Override
    public boolean dianzang(Integer cId) {

        Comment comment = commentMapper.selectByPrimaryKey(cId);
        if(comment == null){

            comment.setStart(1);
            comment.setId(cId);
            commentMapper.insert(comment);
        }
        comment.setStart(comment.getStart()+1);
        int i = commentMapper.updateByPrimaryKey(comment);
        if (i>0){
            return true;
        }
        return false;
    }
}
