package com.bz.smart_city.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.bz.smart_city.entity.Menu;
import com.bz.smart_city.dao.MenuDao;
import com.bz.smart_city.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

    @Resource
    private MenuDao menuDao;

    @Override
    public int insert(Menu menu){
        return menuDao.insert(menu);
    }

    @Override
    public int insertSelective(Menu menu){
        return menuDao.insertSelective(menu);
    }

    @Override
    public int insertList(List<Menu> menus){
        return menuDao.insertList(menus);
    }

    @Override
    public int update(Menu menu){
        return menuDao.update(menu);
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuDao.getAllMenu();
    }
}
