package com.EmployeeDetail;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeDetailMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EmployeeProperties objectProperties = new EmployeeProperties();
		System.out.println("Enter Employee ID : ");
		objectProperties.setEmpID(Integer.parseInt(br.readLine()));
		System.out.println("Enter Employee First Name :");
		objectProperties.setFirstName(br.readLine());
		System.out.println("Enter Employee Last Name : ");
		objectProperties.setLastName(br.readLine());
		System.out.println("Enter Employee Salary :");
		objectProperties.setSalary(Integer.parseInt(br.readLine()));

		EmployeeDetailImpl objectEmployeeDetailImpl = new EmployeeDetailImpl();
		objectEmployeeDetailImpl.getPrintDetail(objectProperties);

	}

}
