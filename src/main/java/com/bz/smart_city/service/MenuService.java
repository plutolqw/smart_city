package com.bz.smart_city.service;

import java.util.List;
import com.bz.smart_city.entity.Menu;
public interface MenuService{

    int insert(Menu menu);

    int insertSelective(Menu menu);

    int insertList(List<Menu> menus);

    int update(Menu menu);

    List<Menu> getAllMenu();
}
