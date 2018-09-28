package com.cc.mapper;

import java.util.List;

import com.cc.entity.Power;

public interface PowerMapper {

	public List<Power> selectPidByRname(String user_role);
}
