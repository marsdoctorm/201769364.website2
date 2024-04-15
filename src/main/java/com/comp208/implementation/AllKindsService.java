package com.comp208.implementation;

import com.comp208.entity.AllKinds;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface AllKindsService {
    int deleteByPrimaryKey(Integer id);

    int insert(AllKinds record);

    int insertSelective(AllKinds record);

    AllKinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AllKinds record);

    int updateByPrimaryKey(AllKinds record);

    List<AllKinds> selectAll();
}
