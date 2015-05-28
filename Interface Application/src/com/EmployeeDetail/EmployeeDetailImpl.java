package com.EmployeeDetail;

public class EmployeeDetailImpl implements EmployeeDetailInterface {
	public void getPrintDetail(EmployeeProperties obj) {
		System.out.println("Company ID is : " + obj.getCOMPANY_ID());
		System.out.println("Employee ID is : " + obj.getEmpID());
		System.out.println("Employee First Name is :" + obj.getFirstName());
		System.out.println("Employee Last Name is : " + obj.getLastName());
		System.out.println("Employee Salary is : " + obj.getSalary());

	}

}
