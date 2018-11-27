package com.bz.smart_city.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.bz.smart_city.entity.Menu;

@Mapper
public interface MenuDao {
    int insert(@Param("menu") Menu menu);

    int insertSelective(@Param("menu") Menu menu);

    int insertList(@Param("menus") List<Menu> menus);

    int update(@Param("menu") Menu menu);

    List<Menu> getAllMenu();
}
