package com.ciftci.leetcode.algorithm2;

import java.util.Stack;

public class S844_BackspaceStringCompare {
	public static void main(String[] args) {

	}

	public boolean backspaceCompare(String s, String t) {

		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		char[] chars1 = s.toCharArray();
		char[] chars2 = t.toCharArray();

		for (int i = 0; i < chars1.length; i++){
			char c = chars1[i];
			if(c == '#'){
				if(!stack1.isEmpty())
					stack1.pop();
				continue;
			}
			stack1.push(c);
		}

		for (int i = 0; i < chars2.length; i++){
			char c = chars2[i];
			if(c == '#'){
				if(!stack2.isEmpty())
					stack2.pop();
				continue;
			}
			stack2.push(c);
		}

		if(stack1.size() != stack2.size())
			return false;

		while (!stack1.isEmpty()){
			Character c1 = stack1.pop();
			Character c2 = stack2.pop();
			if(!c1.equals(c2))
				return false;
		}
		return true;
	}

}
