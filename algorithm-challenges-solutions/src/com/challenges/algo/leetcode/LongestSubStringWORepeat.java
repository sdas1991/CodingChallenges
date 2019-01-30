package com.challenges.algo.leetcode;

import java.util.HashSet;

public class LongestSubStringWORepeat {
	
	public int lengthOfLongestSubString(String s) {
		HashSet<Character> noRepeat=new HashSet<>();
		int i=0,j=0;
		int maxLength=0;
		
		if (s==null || s.length()==0) {
			return maxLength;
		}
		
		while (j<s.length()) {
			if(!noRepeat.contains(s.charAt(j))) {
				System.out.println(s.charAt(j));
				noRepeat.add(s.charAt(j));
				
				System.out.println("maxlength is : "+maxLength);
				j++;
				maxLength=Math.max(maxLength, j-i);
			}else {
				System.out.println("char at i : "+s.charAt(i));
				noRepeat.remove(s.charAt(i));
				i++;
			}
		}
		return maxLength;
		

	}

}
