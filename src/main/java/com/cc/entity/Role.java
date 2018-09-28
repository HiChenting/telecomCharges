package com.cc.entity;

import java.util.List;

public class Role {
	int role_id;				//角色id
	String role_name;			//角色姓名
	int user_id;				//用户id
	private List<Power> powers;	//角色对应的权限
	
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public Role() {	}
	
	/**
	 * 通过角色id查询相应的权限
	 * @param role_id
	 */
	public Role(int role_id) {
		this.role_id = role_id;
	}
	public List<Power> getPowers() {
		return powers;
	}
	
	/**
	 * 添加角色名
	 * @param role_name
	 */
	public Role(String role_name) {
		this.role_name = role_name;
	}
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}

