package com.comp208.implementation;

import com.comp208.entity.OrderForm;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface OrderFormService {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderForm record);

    int insertSelective(OrderForm record);

    OrderForm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderForm record);

    int updateByPrimaryKey(OrderForm record);

    int getCounts(int uid);

    List<OrderForm> selectByUid(int uid, int start);
}
