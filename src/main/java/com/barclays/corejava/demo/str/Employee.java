package com.barclays.corejava.demo.str;

import java.io.Serializable;

class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private int departmentId;
	private String departmentName;
	private String location;

}

public class Employee {

	private int employeeId; // id value User AppUser
	private String firstName; // name
	private double salary;
	private Department department;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
