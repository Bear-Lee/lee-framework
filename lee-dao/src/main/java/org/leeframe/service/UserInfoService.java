package org.leeframe.service;

import java.util.List;

import org.leeframe.model.UserInfo;

public interface UserInfoService {
    public UserInfo getById(Integer id);
    
    public int updateBatch(List<UserInfo> list);
}
