package com.comp208.implementation;

import com.comp208.entity.Classification;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface ClassificationService {
    int deleteByPrimaryKey(Integer id);

    int insert(Classification record);

    int insertSelective(Classification record);

    Classification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);

    List<Classification> selectByAid(int aid);
}
