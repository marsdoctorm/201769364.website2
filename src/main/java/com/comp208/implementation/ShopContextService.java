package com.comp208.implementation;

import com.comp208.entity.ShopContext;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface ShopContextService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopContext record);

    int insertSelective(ShopContext record);

    ShopContext selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopContext record);

    int updateByPrimaryKey(ShopContext record);

    int getCounts(int sid);

    List<ShopContext> findById(int sid, int start);

    List<ShopContext> selectById(int id);
}
