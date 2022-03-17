package com.ciftci.leetcode.topinterview.other;

public class S8_StringtoIntegerAtoi {

	public static void main(String[] args) {
		S8_StringtoIntegerAtoi thiss = new S8_StringtoIntegerAtoi();
		thiss.myAtoi("3.14");
	}

	public int myAtoi(String s) {
		s = s.trim();
		if(s.length() == 0)
			return 0;

		StringBuilder strBuilder = new StringBuilder();

		for(char c : s.toCharArray()){
			if( (c >= '0' && c<= '9') || c == '+' || c == '-'){
				strBuilder.append(c);
			}else{
				break;
			}
		}
		s = strBuilder.toString();

		if(s.length() == 0)
			return 0;
		char charr = s.charAt(0);
		boolean isNegative = false;
		if(charr == '-'){
			isNegative = true;
			s = s.substring(1);
		}

		if(charr == '+'){
			isNegative = false;
			s = s.substring(1);
		}

		char[] chars = s.toCharArray();
		int total = 0;
		int index = 0;
		int n = s.length();
		while (index < n && Character.isDigit(s.charAt(index))) {
			int digit = s.charAt(index) - '0';

			if ((total > Integer.MAX_VALUE / 10) ||
				(total == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
				return isNegative == false ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			// Append current digit to the result.
			total = 10 * total + digit;
			index++;
		}

		if(isNegative)
			total = total * -1;

		return total;
	}

}
