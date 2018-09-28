package com.cc.entity;

import java.util.List;

import com.cc.entity.Power;

public class User {
	String user_name;		//�û�����
	String user_account;	//�û��˺�
	String user_tel;		//�û��绰����
	String user_email;		//�û������ʼ�
	String user_psw;		//�û�����
	String user_date;		//���һ�θ����û���Ϣ��ʱ��
	String role_name;		//�û��Ľ�ɫ
	private List<Role> roles;
	private List<Power> powers;	//��ɫ��Ӧ��Ȩ��
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public User() {}
	/**
	 * �û�ͨ���˺������¼
	 * �û�ͨ���˺����ָ����Լ�����
	 */
	public User(String user_account, String user_psw) {
		this.user_account = user_account;
		this.user_psw = user_psw;
	}
	
	/**
	 * �û�ͨ���Լ��˺��������Լ���Ϣ
	 */
	public User(String user_name, String user_tel, String user_email,String user_account) {
		this.user_name = user_name;
		this.user_tel = user_tel;
		this.user_email = user_email;
		this.user_account = user_account;
	}
	
	/**
	 * �û�ͨ���˺����鿴�Լ���Ϣ
	 * �û�ͨ���˺����޸��Լ�����
	 */
	public User(String user_account) {
		this.user_account = user_account;
	}
	
	/**
	 * ������ӦȨ�޵Ĺ���Ա�û��鿴��������ԱȨ��
	 * @return
	 */
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_psw() {
		return user_psw;
	}
	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}
	public String getUser_date() {
		return user_date;
	}
	public void setUser_date(String user_date) {
		this.user_date = user_date;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_account=" + user_account + ", user_tel=" + user_tel
				+ ", user_email=" + user_email + ", user_psw=" + user_psw + ", user_date=" + user_date + ", role_name="
				+ role_name + ", roles=" + roles + ", powers=" + powers + "]";
	}
	
	
}
