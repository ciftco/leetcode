package com.ciftci.leetcode.topinterview.other.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S273_IntegertoEnglishWords {


	Map<Integer, String> oneMap = new HashMap<>();
	Map<Integer, String> SecondMap = new HashMap<>();
	Map<Integer, String> groupMap = new HashMap<>();

	public S273_IntegertoEnglishWords(){
		oneMap.put(0, "");
		oneMap.put(1, "One");
		oneMap.put(2, "Two");
		oneMap.put(3, "Three");
		oneMap.put(4, "Four");
		oneMap.put(5, "Five");
		oneMap.put(6, "Six");
		oneMap.put(7, "Seven");
		oneMap.put(8, "Eight");
		oneMap.put(9, "Nine");

		SecondMap.put(10, "Ten");
		SecondMap.put(11, "Eleven");
		SecondMap.put(12, "Twelve");
		SecondMap.put(13, "Thirteen");
		SecondMap.put(14, "Fourteen");
		SecondMap.put(15, "Fifteen");
		SecondMap.put(16, "Sixteen");
		SecondMap.put(17, "Seventeen");
		SecondMap.put(18, "Eighteen");
		SecondMap.put(19, "Nineteen");

		SecondMap.put(2, "Twenty");
		SecondMap.put(3, "Thirty");
		SecondMap.put(4, "Forty");
		SecondMap.put(5, "Fifty");
		SecondMap.put(6, "Sixty");
		SecondMap.put(7, "Seventy");
		SecondMap.put(8, "Eighty");
		SecondMap.put(9, "Ninety");


		groupMap.put(0, "");
		groupMap.put(1, "Thousand");
		groupMap.put(2, "Million");
		groupMap.put(3, "Billion");
		groupMap.put(4, "Trillion");
	}
	public static void main(String[] args) {
		S273_IntegertoEnglishWords thiss = new S273_IntegertoEnglishWords();

		String result = thiss.numberToWords(123);
		result = thiss.numberToWords(1112209);
		result = thiss.numberToWords(1218);

	}

	public String numberToWords(int num) {

		List<Integer> groups = new ArrayList<>();
		int tempNum = num;
		while(true){
			int groupNum = tempNum % 1000;
			int divident = tempNum / 1000;
			groups.add(groupNum);
			if(divident == 0){
				break;
			}
			tempNum = divident;
		}

		StringBuilder builder = new StringBuilder();
		for (int i = groups.size() -1; i >=0; i-- ) {
			int groupNum = groups.get(i);


			String groupStr = getStr(groupNum);
			String groupMultiplierString = groupMap.get(i);

			if(groupStr.equals("Zero") && groups.size() == 1 ){
				builder.append(groupStr);
				continue;
			}


			if(!groupStr.equals("Zero")){
				if(builder.length() > 0){
					builder.append(" ");
				}
				builder.append(groupStr);
			}

			if(i != 0 && groupNum != 0 ){
				builder.append(" ");
				String groupMultiplierStr = groupMap.get(i);
				builder.append(groupMultiplierStr);
			}
		}

		String result = builder.toString();
		return result;
	}

	private String getStr(int groupNum){
		StringBuilder stringBuilder = new StringBuilder();

		if(groupNum == 0){
			return "Zero";
		}

		int hundreds = groupNum / 100;
		if (hundreds > 0) {
			String hundredString = oneMap.get(hundreds);
			stringBuilder.append(hundredString);
			stringBuilder.append(" ");
			stringBuilder.append("Hundred");
		}

		int doubleDigitNum = groupNum % 100;
		boolean moreThan20 = false;
		if(doubleDigitNum >=20){
			if(stringBuilder.length() > 0 ){
				stringBuilder.append( " ");
			}
			int secondDigit = doubleDigitNum / 10;
			String secondDigitString = SecondMap.get(secondDigit);
			stringBuilder.append(secondDigitString);
		}
		if(doubleDigitNum <=19 && doubleDigitNum >=10 ){
			if(stringBuilder.length() > 0 ){
				stringBuilder.append( " ");
			}
			String secondDigitString = SecondMap.get(doubleDigitNum);
			stringBuilder.append(secondDigitString);
			return stringBuilder.toString();
		}

		int lastDigit = groupNum % 10;
		if(lastDigit > 0) {
			if(stringBuilder.length() > 0 ){
				stringBuilder.append( " ");
			}
			String lastDigitStr = oneMap.get(lastDigit);
			stringBuilder.append(lastDigitStr);
		}

		return stringBuilder.toString();
	}

}
