package com.bz.smart_city.dao;

import com.bz.smart_city.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.bz.smart_city.entity.UserEntity;

@Mapper
public interface UserEntityDao {
    int insert(@Param("userEntity") UserEntity userEntity);

    int insertSelective(@Param("userEntity") UserEntity userEntity);

    int insertList(@Param("userEntitys") List<UserEntity> userEntitys);

    int update(@Param("userEntity") UserEntity userEntity);

    UserEntity findUserById(@Param("id") Integer id);

    List<UserEntity> findUserList();

    UserEntity loadUserByUsername(@Param("username") String username);

    //UserEntity findUserByName(@Param("username") String username);

    List<Role> getRolesByUserId(Integer id);



}
