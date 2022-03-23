package com.ciftci.leetcode.topinterview;

public class S7_ReverseInteger {

	public static void main(String[] args) {
		S7_ReverseInteger thiss = new S7_ReverseInteger();
		thiss.reverse(-2147483648);
	}
	public int reverse(int x) {
		if(x == 0)
			return x;

		boolean isNegative = x < 0;

		String num  = String.valueOf(x);

		if(isNegative)
			num = num.substring(1);

		StringBuilder builder = new StringBuilder();
		builder.append(num);
		StringBuilder reverse = builder.reverse();
		String s = reverse.toString();

		long val = Long.valueOf(s);
		if(val > Long.valueOf( String.valueOf(Integer.MAX_VALUE)))
			return 0;


		int integer = Integer.valueOf(s);
		if(isNegative)
			integer = integer * -1;

		return integer;
	}
}
