package com.comp208.mappers;

import com.comp208.entity.Comment;

import java.util.List;

/**
 * @author L
 * @description CommentMapper
 * @datetime 2024/3/9 23:14
 */
public interface CommentMapper {

    void insert(Comment comment);

    List<Comment> list();

    void delete(Integer id);

}
