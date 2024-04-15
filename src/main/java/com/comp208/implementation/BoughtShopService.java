package com.comp208.implementation;

import com.comp208.entity.BoughtShop;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface BoughtShopService {
    int deleteByPrimaryKey(Integer id);

    int insert(BoughtShop record);

    int insertSelective(BoughtShop record);

    BoughtShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BoughtShop record);

    int updateByPrimaryKey(BoughtShop record);

    int getCounts(int uid);

    List<BoughtShop> selectByUid(int uid, int start);
}
