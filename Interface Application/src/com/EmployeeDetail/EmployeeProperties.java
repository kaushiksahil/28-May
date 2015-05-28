package com.EmployeeDetail;

public class EmployeeProperties {
	private final int COMPANY_ID = 1234;
	private String firstName;
	private String lastName;
	private int EmpID;
	private int salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCOMPANY_ID() {
		return COMPANY_ID;
	}
}
