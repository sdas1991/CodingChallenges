package com.challenges.algo.leetcode;

public class SquareRoot {
	
	public int square(int val) {
		if (val==0) {
			return 0;
		}
		long start=0;
		long end=val;
		while (start+1<end) {
			long mid=start+(end-start)/2;
			if(mid*mid==val) {
				return (int)mid;
			}
			else if(mid*mid<val) {
				start=mid;
			}
			else if(mid*mid>val) {
				end=mid;
			}
		}
		
		if(end*end==val) {
			return (int)end;
		}else {
			return (int)start;
		}
			
		
	}

}
