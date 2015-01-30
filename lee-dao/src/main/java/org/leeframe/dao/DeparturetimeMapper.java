package org.leeframe.dao;

import org.leeframe.model.Departuretime;

public interface DeparturetimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Departuretime record);

    int insertSelective(Departuretime record);

    Departuretime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Departuretime record);

    int updateByPrimaryKey(Departuretime record);
}