package com.challenges.algo.leetcode;

public class FindARange {
	
	public int[] rangeFunc(int[] arr, int target) {
		
		
		int[] result=new int[2];
		result[0]=-1;
		result[1]=-1;
		if(arr==null || arr.length==0) {
			return result;
		}
		
		//binary search
		int start=0;
		int end=arr.length-1;
		
		while (start+1<end) {
			int mid=start+(end-start)/2;
			
			if (arr[mid]==target) {
				end=mid;
			}else if(arr[mid]>target) {
				end=mid;
			}else {
				start=mid;
			}
		}
		if (arr[end]==target) {
			result[0]=end;
		}
		if(arr[start]==target) {
		result[0]=start;
		}
		
		//binary search2
				start=0;
				end=arr.length-1;
				
				while (start+1<end) {
					int mid=start+(end-start)/2;
					
					if (arr[mid]==target) {
						start=mid;
					}else if(arr[mid]>target) {
						end=mid;
					}else {
						start=mid;
					}
				}
				if (arr[end]==target) {
					result[1]=end;
				}
				if(arr[start]==target) {
				result[1]=start;
				}
				
				return result;
	}
 
}
