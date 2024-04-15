package com.comp208.implementation;

import com.comp208.entity.ShopPicture;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface ShopPictureService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopPicture record);

    int insertSelective(ShopPicture record);

    ShopPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopPicture record);

    int updateByPrimaryKey(ShopPicture record);

    ShopPicture selectBySidOnlyOne(Integer sid);

    List<ShopPicture> selectBySid(Integer sid);
}
