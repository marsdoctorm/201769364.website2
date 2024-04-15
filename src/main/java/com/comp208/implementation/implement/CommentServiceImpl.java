package com.comp208.implementation.implement;

import com.comp208.mappers.CommentMapper;
import com.comp208.entity.Comment;
import com.comp208.implementation.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author L
 * @description CommentServiceImpl
 * @datetime 2024/3/9 23:43
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper mapper;

    @Override
    public void add(Comment comment) {
        mapper.insert(comment);
    }

    @Override
    public List<Comment> list() {
        return mapper.list();
    }

    @Override
    public void delete(Integer id) {
        mapper.delete(id);
    }
}
