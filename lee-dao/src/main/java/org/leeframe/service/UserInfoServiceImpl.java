package org.leeframe.service;

import javax.annotation.Resource;

import org.leeframe.dao.UserInfoMapper;
import org.leeframe.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
    private UserInfoMapper userInfoMapper;
    
    @Override
    public UserInfo getById(Integer id) {
	return userInfoMapper.selectByPrimaryKey(id);
    }

}
