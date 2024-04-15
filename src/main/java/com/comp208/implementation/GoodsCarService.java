package com.comp208.implementation;

import com.comp208.entity.GoodsCar;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface GoodsCarService {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsCar record);

    int insertSelective(GoodsCar record);

    GoodsCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsCar record);

    int updateByPrimaryKey(GoodsCar record);

    List<GoodsCar> selectByUid(int uid);
}
