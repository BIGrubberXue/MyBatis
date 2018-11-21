package com.xjw.mybatis.bean;

public class Employee {
	private int id;
	private String Last_name;
	private String gender;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", Last_name=" + Last_name + ", gender=" + gender + ", email=" + email + "]";
	}
	
}
