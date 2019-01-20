package com.challenges.algo.leetcode;

import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> exists = new HashMap<>();
	int[] result=new int[2];
	if(nums == null || nums.length == 0) {
		return null;
	}
	for (int i = 0; i < nums.length; i++) {
		if(exists.containsKey(target-nums[i])) {
			result[0]=exists.get(target-nums[i]);
			result[1]=i;
			
			
		}
		
		exists.put(nums[i], i);
		
	}
	
	return result;
        
    }

}
