package com.algo.google.challenges.GoodTecher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	private static void twoSumHHelper(int[] arr, List<List<Integer>> finalList, int left, int right, int target) {
		while(left < right){
			if(arr[left]+arr[right]==target){
				List<Integer> oneLsit=new ArrayList<>();
				oneLsit.add(arr[left]);
				oneLsit.add(arr[right]);
				oneLsit.add(-target);
				finalList.add(oneLsit);

				left++;
				right--;
				while(left<right && arr[left]==arr[left-1]){
					left++;
				}
				while(left<right && arr[right]==arr[right+1]){
					right--;
				}
			}
			else if(arr[left]+arr[right]>target){
				right--;
			}else if(arr[left]+arr[right]<target){
				left++;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-1, 0, 1, 2, -1, -4};
		Arrays.sort(input);

		List<List<Integer>> finalList= new ArrayList<>();
		for (int i = 0; i < input.length-2; i++) {
			if (i > 0 && input[i] == input[i - 1]) {
				continue;

			}
			int left=i+1;
			int right =input.length-1;
			int target = -input[i];

			twoSumHHelper(input,finalList,left,right,target);

		}
		for (List<Integer> list: finalList
			 ) {
			System.out.println(list.toString());

		}



		

	}

}
