package com.bz.smart_city.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.bz.smart_city.entity.Role;
import com.bz.smart_city.dao.RoleDao;
import com.bz.smart_city.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleDao roleDao;

    @Override
    public int insert(Role role){
        return roleDao.insert(role);
    }

    @Override
    public int insertSelective(Role role){
        return roleDao.insertSelective(role);
    }

    @Override
    public int insertList(List<Role> roles){
        return roleDao.insertList(roles);
    }

    @Override
    public int update(Role role){
        return roleDao.update(role);
    }
}
