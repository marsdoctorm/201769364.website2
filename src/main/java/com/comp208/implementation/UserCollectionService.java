package com.comp208.implementation;

import com.comp208.entity.UserCollection;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface UserCollectionService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    UserCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCollection record);

    int updateByPrimaryKey(UserCollection record);

    int getCounts(int uid);

    List<UserCollection> selectByUid(int uid, int start);
}
