package com.Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Properties objectProperties = new Properties();
		System.out.println("Enter First Number : ");
		objectProperties.setNumber1(Integer.parseInt(br.readLine()));
		System.out.println("Enter Second Number : ");
		objectProperties.setNumber2(Integer.parseInt(br.readLine()));

		CalculatorImpl objectCalculatorImpl = new CalculatorImpl();
		System.out.println("Sum is : "
				+ objectCalculatorImpl.getSum(objectProperties));
		System.out.println("Subtraction is : "
				+ objectCalculatorImpl.getSubtraction(objectProperties));
		System.out.println("Multiplication is : "
				+ objectCalculatorImpl.getMultiplication(objectProperties));
		System.out.println("Division is : "
				+ objectCalculatorImpl.getDivision(objectProperties));

	}

}
