package com.cc.service;

import java.util.List;

import com.cc.entity.User;

public interface UserService {

	List<User> selectUserWithPowerId(String user_account,String user_psw);
	
	User selectUsers();
}
