package com.Calculator;

public class CalculatorImpl implements CalculatorInterface {

	public int getSum(Properties obj) {

		return obj.getNumber1() + obj.getNumber2();
	}

	public int getSubtraction(Properties obj) {

		return obj.getNumber1() - obj.getNumber2();
	}

	public int getMultiplication(Properties obj) {
		return obj.getNumber1() * obj.getNumber2();
	}

	public int getDivision(Properties obj) {
		return obj.getNumber1() / obj.getNumber2();
	}

}
