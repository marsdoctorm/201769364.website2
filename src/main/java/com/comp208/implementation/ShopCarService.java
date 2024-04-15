package com.comp208.implementation;

import com.comp208.entity.ShopCar;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface ShopCarService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);

    int getCounts(int uid);

//    List<ShopCar> selectByUid(int uid, int start);

    ShopCar selectByUid(int uid);
}
