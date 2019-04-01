package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumNoRepeat {
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	
	List<List<Integer>> result=new ArrayList<>();
    if (candidates==null || candidates.length==0) {
		return result;
	}
    Arrays.sort(candidates);
    List<Integer> holdNum=new ArrayList<>();
    
    check(candidates, result, holdNum, target, 0);
    
    return result;
	
    }

	private void check(int[]  candidates, List<List<Integer>> result,  List<Integer> holdNum, int target, int start) {
		if (target==0) {
			result.add(new ArrayList<>(holdNum));
			return;
		}
		
		for (int i = start; i < candidates.length; i++) {
			if (i!=start && candidates[i]==candidates[i-1]) {
				continue;
			}
			if (candidates[i]>target) {
				break;
			}
			holdNum.add(candidates[i]);
			check(candidates, result, holdNum, target-candidates[i], i+1);
			holdNum.remove(holdNum.size()-1);
		}
	}

}
