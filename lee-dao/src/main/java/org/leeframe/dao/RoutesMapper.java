package org.leeframe.dao;

import org.leeframe.model.Routes;

public interface RoutesMapper {
    int deleteByPrimaryKey(String routename);

    int insert(Routes record);

    int insertSelective(Routes record);

    Routes selectByPrimaryKey(String routename);

    int updateByPrimaryKeySelective(Routes record);

    int updateByPrimaryKeyWithBLOBs(Routes record);
}