package com.bz.smart_city.service;

import java.util.List;
import com.bz.smart_city.entity.UserEntity;
import com.github.pagehelper.PageInfo;

public interface UserEntityService  {

    int insert(UserEntity userEntity);

    int insertSelective(UserEntity userEntity);

    int insertList(List<UserEntity> userEntitys);

    int update(UserEntity userEntity);

    UserEntity findUserById(Integer id);

    PageInfo<UserEntity> findUserList(int pageNum, int pageSize);
}
