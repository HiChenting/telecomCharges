package com.cc.entity;

public class Power {
	int power_id;
	String power_name;
	String role_name;
	
	public Power() {}
	
	/**
	 * 向rolepower表插入角色和对应的权限
	 * @return
	 */
	public Power(String power_name, String role_name) {
		super();
		this.power_name = power_name;
		this.role_name = role_name;
	}

	

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public int getPower_id() {
		return power_id;
	}

	public void setPower_id(int power_id) {
		this.power_id = power_id;
	}

	public String getPower_name() {
		return power_name;
	}

	public void setPower_name(String power_name) {
		this.power_name = power_name;
	}

	@Override
	public String toString() {
		return power_id+"";
	}
	
}