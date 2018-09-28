package com.cc.entity;

import java.util.List;

import com.cc.entity.Power;

public class User {
	String user_name;		//用户姓名
	String user_account;	//用户账号
	String user_tel;		//用户电话号码
	String user_email;		//用户电子邮件
	String user_psw;		//用户密码
	String user_date;		//最后一次更新用户信息的时间
	String role_name;		//用户的角色
	private List<Role> roles;
	private List<Power> powers;	//角色对应的权限
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public User() {}
	/**
	 * 用户通过账号密码登录
	 * 用户通过账号名字更改自己密码
	 */
	public User(String user_account, String user_psw) {
		this.user_account = user_account;
		this.user_psw = user_psw;
	}
	
	/**
	 * 用户通过自己账号名更改自己信息
	 */
	public User(String user_name, String user_tel, String user_email,String user_account) {
		this.user_name = user_name;
		this.user_tel = user_tel;
		this.user_email = user_email;
		this.user_account = user_account;
	}
	
	/**
	 * 用户通过账号名查看自己信息
	 * 用户通过账号名修改自己密码
	 */
	public User(String user_account) {
		this.user_account = user_account;
	}
	
	/**
	 * 具有相应权限的管理员用户查看其他管理员权限
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
