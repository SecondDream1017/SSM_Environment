package com.atguigu.environment.model;

public class User {

	private Integer id;
	private String name;
	private String password;
	private boolean company;	//是否为企业用户,FALSE=不是
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isCompany() {
		return company;
	}
	public void setCompany(boolean company) {
		this.company = company;
	}
	public User(Integer id, String name, String password, boolean company) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.company = company;
	}
	
	public User() {
		super();
	}
	
	
}
