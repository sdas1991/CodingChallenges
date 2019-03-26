package com.challenges.algo.leetcode;

public class DuplicateValueArray {
	
public int removeDuplicates(int[] nums) {
     
	if (nums==null || nums.length==0) {
		return 0;
	}
	
		int i=0;
		for (int j = i; j < nums.length; j++) {
			if (nums[j]!=nums[i]) {
				i++;
				nums[i]=nums[j];
			}
		}
	
	
	return i+1;
    }

}
