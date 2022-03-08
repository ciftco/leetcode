package com.ciftci.leetcode.datastructures2;

import java.util.ArrayDeque;
import java.util.Queue;

public class E11_415_AddStrings {

    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {

        Queue<Integer> firstNumbers = new ArrayDeque<>();
        Queue<Integer> secondNumbers = new ArrayDeque<>();

        char[] chars = num1.toCharArray();

        for (int i = chars.length -1 ; i >=0; i-- ){
            Character aChar = chars[i];
            Integer number = Integer.valueOf(aChar.toString());
            firstNumbers.add(number);
        }

        char[] charsSecond = num2.toCharArray();

        for (int i = charsSecond.length -1 ; i >=0; i-- ){
            Character aChar = charsSecond[i];
            Integer number = Integer.valueOf(aChar.toString());
            secondNumbers.add(number);
        }

        String resultString = "";

        int addition = 0;
        while ( !firstNumbers.isEmpty() || !secondNumbers.isEmpty()){

            int first = !firstNumbers.isEmpty() ? firstNumbers.poll() : 0;
            int second = !secondNumbers.isEmpty() ? secondNumbers.poll() : 0;

            int result = first + second + addition;
            int number = result % 10;
            addition = result / 10;
            resultString = number + resultString;
        }

        if(addition != 0){
            resultString = addition + resultString;

        }

        return  resultString;
    }

}
