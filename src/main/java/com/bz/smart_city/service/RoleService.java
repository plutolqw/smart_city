package com.bz.smart_city.service;

import java.util.List;
import com.bz.smart_city.entity.Role;
public interface RoleService{

    int insert(Role role);

    int insertSelective(Role role);

    int insertList(List<Role> roles);

    int update(Role role);
}
