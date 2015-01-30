package org.leeframe.dao;

import org.leeframe.model.Stations;

public interface StationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stations record);

    int insertSelective(Stations record);

    Stations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stations record);

    int updateByPrimaryKey(Stations record);
}