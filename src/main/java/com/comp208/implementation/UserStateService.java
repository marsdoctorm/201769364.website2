package com.comp208.implementation;

import com.comp208.entity.UserState;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface UserStateService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserState record);

    int insertSelective(UserState record);

    UserState selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);

    UserState selectByUid(int uid);
}
