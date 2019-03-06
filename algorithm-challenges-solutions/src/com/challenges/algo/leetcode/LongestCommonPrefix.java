package com.challenges.algo.leetcode;

public class LongestCommonPrefix {
	
	  public String longestCommonPrefix(String[] strs) {
		  
		  if (strs==null || strs.length==0) {
			return "";
		}
		  
		  String longestPrefix=strs[0];
		  
		  for (int i = 1; i < strs.length; i++) {
			int j=0;
			while(j<longestPrefix.length() && j<strs[i].length() && longestPrefix.charAt(j)==strs[i].charAt(j)) {
				j++;
			}
			
			if(j==0) {
				return "";
			}
			
			longestPrefix=longestPrefix.substring(0, j);
		}
		  
	      return longestPrefix;  
	    }

}
