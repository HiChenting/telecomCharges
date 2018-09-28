package com.cc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.entity.User;
import com.cc.mapper.UserMapper;
import com.cc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	public List<User> selectUserWithPowerId(String user_account,String user_psw) {
		// TODO Auto-generated method stub
		return userMapper.selectUserWithPowerId(user_account, user_psw);
	}
	
	public User selectUsers() {
		return userMapper.selectUsers();
	}

}
