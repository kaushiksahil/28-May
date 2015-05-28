package com.Print;

public class PrintMain {

	public static void main(String[] args) {
		Properties objectProperties = new Properties();
		objectProperties.setNumber1(10);
		objectProperties.setNumber2(20);
		InterfacePrint obj = new PrintImplement();
		obj.getPrint(objectProperties);
		obj.getPrint(objectProperties);

	}

}
