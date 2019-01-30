package com.challenges.algo.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class StudentLunchBox {
	
	public int lunchBox(int[] a, int[] b) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		if(a.length != b.length) {
			return 0;
		}
		Stack<Integer> store=new Stack<>();
		for (int i = 0; i < b.length; i++) {
			if (a[i]==1) {
				store.push(a[i]);
			}
			if(b[i]==1) {
				store.pop();
			}
		}
		
		if(store.isEmpty()) {
			return 0;
		}else {
			return store.size();
		}
		
		
	}

}
