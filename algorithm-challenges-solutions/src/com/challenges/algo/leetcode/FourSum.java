package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
public List<List<Integer>> fourSum(int[] nums, int target) {
	
	List<List<Integer>> result=new ArrayList<>();
	Arrays.sort(nums);
	for (int i = 0; i < nums.length-3; i++) {
		if (i!=0 && nums[i]==nums[i-1]) {
			continue;
		}
		
		
		for (int j = i+1; j < nums.length-2; j++) {
			if (j!=i+1 && nums[j]==nums[j-1]) {
				continue;
			}
			int left=j+1;
			int right=nums.length-1;
			
			while (left<right) {
				int sum=nums[i]+nums[j]+nums[left]+nums[right];
				if (sum>target) {
					right--;
				}else if(sum<target) {
					left++;
				}else {
					List<Integer> value=new ArrayList<>();
					value.add(nums[i]);
					value.add(nums[j]);
					value.add(nums[left]);
					value.add(nums[right]);
					result.add(value);
					left++;
					right--;
					while(left<right && nums[left]==nums[left-1]) {
						left++;
					}
					while (left <right && nums[right]==nums[right+1]) {
						right--;
					}
				}
			}
			
			
			
			
		}
		
		
	}
	
	return result;
        
    }

}
