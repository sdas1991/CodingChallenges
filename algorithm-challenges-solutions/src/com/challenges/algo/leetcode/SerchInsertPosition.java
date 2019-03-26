package com.challenges.algo.leetcode;

public class SerchInsertPosition {
	public int searchPos(int[] nums,int target) {
		
		if (nums==null || nums.length==0) {
			return -1;
		}
		
		int val=-1;
		//binary search
				int start=0;
				int end=nums.length-1;
				
				while (start+1<end) {
					int mid=start+(end-start)/2;
					
					if (nums[mid]==target) {
						return mid;
					}else if(nums[mid]>target) {
						end=mid;
					}else {
						start=mid;
					}
				}
				if (nums[end]<target) {
					return end+1;
				}
				else if(nums[start]>=target) {
				return start;
				}else//start<target && end>target) 
					{
					return end;
				}
				
				
	}

}
