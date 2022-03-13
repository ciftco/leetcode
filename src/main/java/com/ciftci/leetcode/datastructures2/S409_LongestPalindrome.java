package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.Map;

public class S409_LongestPalindrome {
        public static void main(String[] args) {

			String str = "abccccd" ;
			S409_LongestPalindrome thiss = new S409_LongestPalindrome();
			int result = thiss.longestPalindrome(str);
			System.out.println();

		}

        public int longestPalindrome(String s) {
                Map<Character, Integer> frequencyMap = new HashMap<>();
                char[] chars = s.toCharArray();
                for (Character ch : chars){
					frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                }

				int result = 0;
				boolean oodCharecterExist = false;
				for(Map.Entry<Character, Integer> entry :  frequencyMap.entrySet()){
					int value = entry.getValue();
					if(value % 2 == 0){
						result = result + value;
						continue;
					}
					if(value % 2 == 1){
						result = result + ((value % 2 ) * 2);
						oodCharecterExist = true;
						continue;
					}
				}

				if(oodCharecterExist == true){
					result ++;
				}

				return result;
        }
}
