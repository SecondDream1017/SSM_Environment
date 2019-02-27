package com.atguigu.environment.model;

import java.io.Serializable;
import java.util.Set;

public class Bag implements Serializable{

	private Integer id;			//主键Id
	private String name;		//包裹名称
	private Integer orderNum; 	//序号,为了包裹移动时使用,跟id值相同
	
	private transient Survey survey;		//调查
	private Set<Question> questionSet;

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

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public Set<Question> getQuestionSet() {
		return questionSet;
	}

	public void setQuestionSet(Set<Question> questionSet) {
		this.questionSet = questionSet;
	}

	public Bag() {
		super();
	}

	@Override
	public String toString() {
		return "Bag [id=" + id + ", name=" + name + ", orderNum=" + orderNum
				+ "]";
	}

}
