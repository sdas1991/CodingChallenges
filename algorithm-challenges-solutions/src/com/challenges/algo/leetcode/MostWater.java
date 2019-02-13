package com.challenges.algo.leetcode;

public class MostWater {
public int maxArea(int[] height) {
	int maxArea=0;
	if (height==null || height.length==0 ) {
		return 0;
	}
	
	int left=0;
	int right=height.length-1;
	while (right>left) {
		int area=(right-left)*Math.min(height[left], height[right]);
		maxArea=Math.max(area, maxArea);
		if(height[left]<height[right]) {
			left++;
		}else {
			right--;
		}
	}
        
	
	return maxArea;
    }

}
