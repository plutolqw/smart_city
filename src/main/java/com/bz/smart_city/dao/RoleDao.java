package com.bz.smart_city.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.bz.smart_city.entity.Role;

@Mapper
public interface RoleDao {
    int insert(@Param("role") Role role);

    int insertSelective(@Param("role") Role role);

    int insertList(@Param("roles") List<Role> roles);

    int update(@Param("role") Role role);
}
