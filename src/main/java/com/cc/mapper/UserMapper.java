package com.cc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cc.entity.User;

public interface UserMapper {

	//�����û��˺ŵ�¼����ʾ��ͬ������
	public List<User> selectUserWithPowerId(@Param("user_account") String user_account,@Param("user_psw")String user_psw);
	
	public User selectUsers();
}
