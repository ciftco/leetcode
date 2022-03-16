package com.ciftci.leetcode.algorithm2;

import java.util.HashSet;
import java.util.Set;

public class S202_HappyNumber {

	public static void main(String[] args) {
		S202_HappyNumber thiss = new S202_HappyNumber();
		thiss.isHappy(19);
	}

	public boolean isHappy(int n) {

		if(n == 1)
			return true;

		Set<Integer> computedNumbers = new HashSet<>();
		while(true){
			int total = 0;
			computedNumbers.add(n);
			while(n>=1) {
				int lastNumber = n % 10;

				total += (lastNumber * lastNumber);
				n = n/10;
			}
			if(total == 1)
				return true;
			if(computedNumbers.contains(total))
				break;

			n = total;
		}


		return false;

	}

}
