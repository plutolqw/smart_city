package com.bz.smart_city.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.bz.smart_city.entity.UserEntity;
import com.bz.smart_city.dao.UserEntityDao;
import com.bz.smart_city.service.UserEntityService;

@Service
public class UserEntityServiceImpl implements UserEntityService{

    @Resource
    private UserEntityDao userEntityDao;

    @Override
    public int insert(UserEntity userEntity){
        return userEntityDao.insert(userEntity);
    }

    @Override
    public int insertSelective(UserEntity userEntity){
        return userEntityDao.insertSelective(userEntity);
    }

    @Override
    public int insertList(List<UserEntity> userEntitys){
        return userEntityDao.insertList(userEntitys);
    }

    @Override
    public int update(UserEntity userEntity){
        return userEntityDao.update(userEntity);
    }

    @Override
    public UserEntity findUserById(Integer id) {
        return userEntityDao.findUserById(id);
    }

    @Override
    public PageInfo<UserEntity> findUserList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserEntity> list = userEntityDao.findUserList();
        PageInfo<UserEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
