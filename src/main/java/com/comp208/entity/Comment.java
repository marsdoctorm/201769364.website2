package com.comp208.entity;

import lombok.Data;


/**
 * @author L
 * @description 评论表
 * @datetime 2024/3/9 23:08
 */
@Data
public class Comment {

    private Integer id;

    private String content;

    private String time;
}
