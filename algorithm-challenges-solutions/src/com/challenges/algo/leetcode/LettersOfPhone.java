package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LettersOfPhone {
	
	public List<String> phoneNumberCombo(String digits){
		
		List<String> result=new ArrayList<>();
		
		Map<Character, char[]> letterMap=new HashMap<>();
		letterMap.put('0', new char[] {});
		letterMap.put('1', new char[] {});
		letterMap.put('2', new char[] {'a','b','c'});
		letterMap.put('3', new char[] {'d','e','f'});
		letterMap.put('4', new char[] {'g','h','i'});
		letterMap.put('5', new char[] {'j','k','l'});
		letterMap.put('6', new char[] {'m','n','o'});
		letterMap.put('7', new char[] {'p','q','r','s'});
		letterMap.put('8', new char[] {'t','u','v'});
		letterMap.put('9', new char[] {'w','x','y','z'});
		
		
		
		
		StringBuilder sb=new StringBuilder();
		letterCombinationHelper(digits, sb, letterMap, result);
		
		
		return result;
	}
	
	private void letterCombinationHelper(String digits, StringBuilder sb, Map<Character, char[]> letterMap,List<String> result) {
		
		if (sb.length()==digits.length()) {
			result.add(sb.toString());
			return; 
		}
		
		
		
		for (char ch : letterMap.get(digits.charAt(sb.length()))) {
			sb.append(ch);
			letterCombinationHelper(digits, sb, letterMap, result);
			
			sb.deleteCharAt(sb.length()-1);
		
			
		}
		
		
		
	}

}
