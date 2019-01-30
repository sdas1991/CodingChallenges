package com.challenges.algo.leetcode;

public class MedianOfArray {
	
	public double findMedianSortedArrays(int[] num1, int[] num2) {
		if(num1.length>num2.length) {
			System.out.println("reversed");
			return findMedianSortedArrays(num2, num1);
		}
		
		int x=num1.length;
		int y=num2.length;
		
		int low=0;
		int high=x;
		
		while (low<=high) {
			int partitionX=(low+high)/2;
			int partitionY=(x+y+1)/2-partitionX;
			
			int maxLeftX=(partitionX==0)?Integer.MIN_VALUE:num1[partitionX-1];
			int minRightX=(partitionX==x)?Integer.MAX_VALUE:num1[partitionX];
			
			int maxLeftY=(partitionY==0)?Integer.MIN_VALUE:num2[partitionY-1];
			int minRightY=(partitionY==y)?Integer.MAX_VALUE:num2[partitionY];
			
			if (maxLeftX<=minRightY && maxLeftY<=minRightX) {
				if ((x+y)%2==0) {
					return ((double)Math.max(maxLeftY, maxLeftX)+(double)Math.min(minRightX, minRightY))/2;
				}else {
					return (double)(Math.max(maxLeftY, maxLeftX));
				}
				
			}else if (maxLeftX>minRightY) {
				high=partitionX-1;
			}else {
				low=partitionX+1;
			}
		}
		throw new IllegalArgumentException();
		
		
	}

}
