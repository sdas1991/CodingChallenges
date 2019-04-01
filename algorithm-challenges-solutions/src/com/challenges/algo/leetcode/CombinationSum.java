package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        
		 List<List<Integer>> result=new ArrayList<List<Integer>>();
		 List<Integer> combination=new ArrayList<>();
		 
		 if (candidates==null || candidates.length==0) {
			return result;
		}
		 Arrays.sort(candidates);
		 helperMethod(result, combination, candidates, target, 0);
		 
		 return result;
		 
		 
	    }
	 
	 private void helperMethod(List<List<Integer>> result, List<Integer> combination,int[] candidates, int target, int start ) {
		 
		 if(target==0) {
			 result.add(new ArrayList<>(combination));//new ArrayList<>(combination)
			 System.out.println("Combination when target reached : "+combination.toString());
			 return;
		 }
		 
		 for (int i = start; i < candidates.length; i++) {
			 System.out.println("candidate[i] :"+candidates[i]);
			if (candidates[i]>target) {
				break;
			}
			combination.add(candidates[i]);
			System.out.println("Combination when ading candidates : "+combination.toString());
			System.out.println("target :"+(target-candidates[i]));
			helperMethod(result, combination, candidates, target-candidates[i], i);
			System.out.println("Combination before removing : "+combination.toString());
			combination.remove(combination.size()-1);
			
		}
	 }

}
