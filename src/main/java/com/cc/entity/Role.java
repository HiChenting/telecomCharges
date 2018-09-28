package com.cc.entity;

import java.util.List;

public class Role {
	int role_id;				//��ɫid
	String role_name;			//��ɫ����
	int user_id;				//�û�id
	private List<Power> powers;	//��ɫ��Ӧ��Ȩ��
	
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public Role() {	}
	
	/**
	 * ͨ����ɫid��ѯ��Ӧ��Ȩ��
	 * @param role_id
	 */
	public Role(int role_id) {
		this.role_id = role_id;
	}
	public List<Power> getPowers() {
		return powers;
	}
	
	/**
	 * ��ӽ�ɫ��
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

