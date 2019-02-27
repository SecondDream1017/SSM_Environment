package com.atguigu.environment.model;

import java.io.Serializable;

public class Question implements Serializable{
	//包裹下面的问题
	
	private Integer id;			//主键Id
	private String name;		//问题名称
	private Integer type; 		//题型,0单选 1多选 2简答题
	private String optiones;	//选项,单选和多选出现
	
	private Bag bag;			//包裹

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getOptiones() {
		return optiones;
	}

	//设置选项,前端页面用换行符\r\n来分开,入库用','号区分
	public void setOptiones(String optiones) {
		this.optiones = optiones.replaceAll("\r\n", ",");
	}

	//勾选时返回给前端页面
	public String[] getOptionsArr(){
		return this.optiones.split(",");
	}
	
	//编辑回显时,将库里选项','变成\r\n
	public String getOptionsEdit(){
		return this.optiones.replaceAll(",","\r\n");
	}
	
	public Bag getBag() {
		return bag;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}

	public Question() {
		super();
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", type=" + type
				+ ", optiones=" + optiones + "]";
	}

	
}
