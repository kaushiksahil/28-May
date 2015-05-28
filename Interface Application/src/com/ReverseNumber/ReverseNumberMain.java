package com.ReverseNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumberMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Property objectProperty = new Property();
		System.out.println("Enter Number : ");
		objectProperty.setNumber(Integer.parseInt(br.readLine()));
		ReverseNumberImpl objectReverseNumberImpl = new ReverseNumberImpl();
		System.out.println("Reverse Number is : "
				+ objectReverseNumberImpl.getReverseNumber(objectProperty));

	}

}
