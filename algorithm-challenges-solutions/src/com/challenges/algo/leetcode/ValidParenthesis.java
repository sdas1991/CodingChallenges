package com.challenges.algo.leetcode;


import java.util.Stack;

public class ValidParenthesis {
	
public  boolean isValid(String s) {
        if (s==null || s.length()==0) {
			return false;
		}
        Stack<Character> result=new Stack<>();
        for (int i = 0; i < s.length(); i++) { 
        	if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
        		result.push(s.charAt(i));
			}else {
				if (!result.isEmpty() && checkValid(result.peek(),s.charAt(i))) {
					result.pop();
				}else{
					return false;
				};
			}
			
		}
        
        return result.isEmpty();
    }

public  boolean checkValid(Character peeking, Character stringOne) {
	
	
		if(peeking=='(' && stringOne==')'|| peeking=='{' && stringOne=='}' || peeking=='[' && stringOne==']') {
			return true;
		}else 
			return false;
		}
	
		
	
	
}


