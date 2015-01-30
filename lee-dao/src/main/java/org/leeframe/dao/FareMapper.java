package org.leeframe.dao;

import org.leeframe.model.Fare;

public interface FareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fare record);

    int insertSelective(Fare record);

    Fare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fare record);

    int updateByPrimaryKey(Fare record);
}