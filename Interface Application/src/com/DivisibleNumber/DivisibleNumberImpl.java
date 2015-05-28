package com.DivisibleNumber;

public class DivisibleNumberImpl implements DivisibleNumberInterface {
	int sum = 0;
	int count = 0;

	public void getPrint(Properties obj) {

		int loop;
		for (loop = obj.getStartingNumber(); loop <= obj.getLastNumber(); loop++) {
			if (loop % obj.getDivisibleNumber() == 0) {
				System.out.println(loop);
				this.count++;
				this.sum = this.sum + loop;
			}
		}

	}

}
