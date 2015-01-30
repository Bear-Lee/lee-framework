package org.leeframe.service;

import javax.annotation.Resource;

import org.leeframe.dao.DeparturetimeMapper;
import org.leeframe.model.Departuretime;
import org.springframework.stereotype.Service;

@Service("departuretimeService")
public class DeparturetimeServiceImpl implements DeparturetimeService {
	@Resource
	private DeparturetimeMapper departuretimeMapper;

	@Override
	public Departuretime getDepart(Integer id) {
		return departuretimeMapper.selectByPrimaryKey(id);
	}

}
