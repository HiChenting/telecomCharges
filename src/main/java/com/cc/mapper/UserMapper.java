package com.cc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cc.entity.User;

public interface UserMapper {

	//根据用户账号登录后显示不同主界面
	public List<User> selectUserWithPowerId(@Param("user_account") String user_account,@Param("user_psw")String user_psw);
	
	public User selectUsers();
}
