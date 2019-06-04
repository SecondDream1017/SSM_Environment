package com.atguigu.environment.model;

public class Person {

	private Integer id;
	private String name;
	private String email;
	private double salary;
	
	private Department department;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Person(Integer id, String name, String email, double salary,
			Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
}
