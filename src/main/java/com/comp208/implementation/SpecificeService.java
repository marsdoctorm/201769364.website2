package com.comp208.implementation;

import com.comp208.entity.Specific;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface SpecificeService {
    int deleteByPrimaryKey(Integer id);

    int insert(Specific record);

    int insertSelective(Specific record);

    Specific selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Specific record);

    int updateByPrimaryKey(Specific record);

    List<Specific> selectByCid(int cid);
}
