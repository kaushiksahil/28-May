package com.ReverseNumber;

public class ReverseNumberImpl implements ReverseNumberInterface {

	public int getReverseNumber(Property obj) {
		int methodNumber = obj.getNumber();
		int reverseNumber = 0;
		for (int loop = 1; loop <= methodNumber;) {
			int digit = methodNumber % 10;
			reverseNumber = (reverseNumber * 10) + digit;
			methodNumber = methodNumber / 10;
		}
		return reverseNumber;
	}

}
