package com.vn.longtq2.entities;

public class Employee {
	public int id;
	public String Name;
	public int Age;
	public double Salary;
	
	public Employee(int id, String Name, int Age, double Salary) {
		super();
		this.id = id;
		this.Name = Name;
		this.Age = Age;
		this.Salary = Salary;
	}

	public String toString() {
        return "id=" + id + ",name=" + Name 
                + ",age=" + Age + ",Salary=" + Salary;
    }
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

}
