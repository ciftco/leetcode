package com.ciftci.leetcode.algorithm2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S438_FindAllAnagramsinaString {

	public static void main(String[] args) {

		S438_FindAllAnagramsinaString thiss = new S438_FindAllAnagramsinaString();
		thiss.findAnagrams( "cbaebabacd" , "abc" ) ;

	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();

		char[] wordChars = p.toCharArray();
		Map<Character, Integer> characterFrequency = new HashMap<>();
		int anagramLentgh = wordChars.length;
		for (int i = 0; i < anagramLentgh; i++){
			char c = wordChars[i];
			characterFrequency.put(c, characterFrequency.getOrDefault(c, 0) +1);
		}


		char[] stringCharacters = s.toCharArray();
		int stringLength = stringCharacters.length;
		Map<Character, Integer> stringFrequency  = new HashMap<>();
		int secondPointer = 0;
		for (int i = 0; i < stringLength; i++){


			char currentCharacter = stringCharacters[i];
			if(i > anagramLentgh -1 ) {
				char stringCharacter = stringCharacters[secondPointer];
				int count = stringFrequency.get(stringCharacter);
				if( count == 1){
					stringFrequency.remove(stringCharacter);
				}else {
					stringFrequency.put(stringCharacter, count -1);
				}
				secondPointer++;
			}

			stringFrequency.put(currentCharacter, stringFrequency.getOrDefault(currentCharacter, 0) +1);

			boolean isEqual = controlEqueals(stringFrequency, characterFrequency);
			if(isEqual){
				result.add(secondPointer);
			}
		}

		return result;
	}

	private boolean controlEqueals(Map<Character, Integer> stringFrequency, Map<Character, Integer> characterFrequency) {
		if(stringFrequency.keySet().size() != characterFrequency.keySet().size())
			return false;
		for( Character c : characterFrequency.keySet()){
			if(!stringFrequency.keySet().contains(c)){
				return false;
			}
			if(!characterFrequency.get(c).equals(stringFrequency.get(c))){
				return false;
			}
		}
		return true;
	}
}
