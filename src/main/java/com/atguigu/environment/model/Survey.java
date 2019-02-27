package com.atguigu.environment.model;

import java.util.Set;

public class Survey {

	private Integer id;
	private String name;
	private String logoPath="res_static/logo.gif";
	private boolean complete;	//是否完成调查
	private User user;			//谁创建的调查
	
	private Set<Bag> bagSet;
	
	
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
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<Bag> getBagSet() {
		return bagSet;
	}
	public void setBagSet(Set<Bag> bagSet) {
		this.bagSet = bagSet;
	}
	public Survey() {
		super();
	}
	public Survey(Integer id, String name, String logoPath, boolean complete,
			User user) {
		super();
		this.id = id;
		this.name = name;
		this.logoPath = logoPath;
		this.complete = complete;
		this.user = user;
	}
	public Survey(Integer id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Survey [id=" + id + ", name=" + name + ", logoPath=" + logoPath
				+ ", complete=" + complete + "]";
	}
	
}
