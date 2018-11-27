package com.bz.smart_city.commom.security;

import com.bz.smart_city.dao.UserEntityDao;
import com.bz.smart_city.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CustomUserDetailServiceImpl implements UserDetailsService {
    @Resource
    private UserEntityDao userEntityDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userEntityDao.loadUserByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        return userEntity;
    }
}
