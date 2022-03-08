package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EX_1249_MinimumRemovetoMakeValidParentheses {

    public static void main(String[] args) {
    }

    public static String minRemoveToMakeValid(String s) {

        List<Integer> characterIndexToRemove = new ArrayList<>();

        char[] chars = s.toCharArray();
        Stack<Integer> parantesisStack = new Stack<>();
        for (int i = 0 ; i < chars.length ; i++){
            char currentChar = chars[i];
            if(currentChar == '('){
                parantesisStack.push(i);
            }
            if(currentChar == ')'){
                if(parantesisStack.isEmpty()) {
                    characterIndexToRemove.add(i);
                    continue;
                }
                parantesisStack.pop();
            }
        }

        while (!parantesisStack.isEmpty()){
            Integer pop = parantesisStack.pop();
            characterIndexToRemove.add(pop);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (!characterIndexToRemove.contains(i))
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
