package com.vn.longtq2.entities;

import java.util.Date;

public class Employee {
	public int id;
	public String Name;
	public int Age;
	public double Salary;
	public Date BD;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Date getBD() {
		return BD;
	}
	public void setBD(Date bD) {
		BD = bD;
	}

}
