package com.comp208.implementation;

import com.comp208.entity.Comment;

import java.util.List;

/**
 * @author L
 * @description
 * @datetime 2024/3/9 23:42
 */
public interface CommentService {

    void add(Comment comment);

    List<Comment> list();

    void delete(Integer id);
}
