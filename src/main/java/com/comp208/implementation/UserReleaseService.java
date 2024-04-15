package com.comp208.implementation;

import com.comp208.entity.UserRelease;

import java.util.List;

/**
 * Created by comp208 on 2024.3.1.
 */
public interface UserReleaseService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRelease record);

    int insertSelective(UserRelease record);

    UserRelease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRelease record);

    int updateByPrimaryKey(UserRelease record);

    int getCounts(int uid);

    List<UserRelease> selectByUid(int uid, int start);

    List<UserRelease> selectUserProductByUid(int uid);
}
