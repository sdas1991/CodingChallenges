package com.challenges.algo.leetcode;

public class NeedleAndHaystack {
	
public int strStr(String haystack, String needle) {
        
	if (haystack.length()==needle.length()) {
		return 0;
	}
	int j = 0;
	for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
		for (; j < needle.length(); j++) {
			if (haystack.charAt(i+j)!=needle.charAt(j)) {
				j=0;
				break;
			}
			
		}
		
		if (j==needle.length()) {
			return i;
		}
	}
	
	return -1;
	
	
    }

}
