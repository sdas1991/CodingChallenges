package com.algo.google.challenges.GoodTecher;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] input, int target) {
		int[] output = new int[2];		
		Map<Integer, Integer> exists=new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			if(exists.containsKey(target-input[i])) {
				output[0]=exists.get(target-input[i]);
				output[1]=i;
				return output;
			}
			exists.put(input[i], i);
		}	
		
		return output;
	}
	
	

	public static void main(String[] args) {
		
		int[] input = {2,5,8,4,6,3,0};
		int target = 9;
		int[] output = new int[2];
		output=twoSum(input, target);
		System.out.println(output[0]+" "+output[1]);
	}

}
