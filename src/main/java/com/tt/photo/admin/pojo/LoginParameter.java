package com.tt.photo.admin.pojo;

public class LoginParameter {
	
	private String user;
	private String password;
	private String safety; //验证码
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSafety() {
		return safety;
	}
	public void setSafety(String safety) {
		this.safety = safety;
	}
	
	

}
