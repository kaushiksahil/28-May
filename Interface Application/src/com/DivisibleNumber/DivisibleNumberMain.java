package com.DivisibleNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DivisibleNumberMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Properties objectProperties = new Properties();
		System.out.println("Enter Starting Number : ");
		objectProperties.setStartingNumber(Integer.parseInt(br.readLine()));
		System.out.println("Enter Last Number : ");
		objectProperties.setLastNumber(Integer.parseInt(br.readLine()));
		System.out.println("Enter Divider Number : ");
		objectProperties.setDivisibleNumber(Integer.parseInt(br.readLine()));

		DivisibleNumberImpl objectDivisibleInterfaceImpl = new DivisibleNumberImpl();
		objectDivisibleInterfaceImpl.getPrint(objectProperties);
		System.out.println("Sum is : " + objectDivisibleInterfaceImpl.sum);
		System.out.println("Total Numbers are : "
				+ objectDivisibleInterfaceImpl.count);

	}

}
