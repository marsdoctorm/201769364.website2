package com.comp208.controller;

import com.comp208.entity.Comment;
import com.comp208.response.BaseResponse;
import com.comp208.implementation.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author L
 * @description
 * @datetime 2024/3/9 23:45
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    CommentService commentService;

    @PostMapping("/add")
    public BaseResponse addComment(@RequestBody Comment comment){
        commentService.add(comment);
        return BaseResponse.success();
    }

    @GetMapping("/list")
    public BaseResponse listComment(){
        BaseResponse success = BaseResponse.success();
        success.setData(commentService.list());
        return success;
    }

    @PostMapping("/delete")
    public BaseResponse deleteComment(@RequestBody Comment comment){
        commentService.delete(comment.getId());
        return BaseResponse.success();
    }

}
