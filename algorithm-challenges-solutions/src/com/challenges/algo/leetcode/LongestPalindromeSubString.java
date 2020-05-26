package com.challenges.algo.leetcode;

public class LongestPalindromeSubString {
	
	public String longestPalindrome(String s) {
		
		int length=s.length();
		
		if(s==null || s.length()==0) {
			return s;
		}
		
		boolean[][] isPalindrome=new boolean[length][length];
		int left=0;
		int right=0;
		
		for (int j = 1; j < s.length(); j++) {
			for (int i = 0; i < j; i++) {
				
				boolean innerPalindrome=isPalindrome[i+1][j-1] || j-i<=2;//babad
				System.out.println(isPalindrome[i+1][j-1]);
				System.out.println("inner word palindrome "+innerPalindrome);
				if (s.charAt(i)==s.charAt(j) && innerPalindrome) {
					System.out.println(s.charAt(i)+" "+s.charAt(j));
					isPalindrome[i][j]=true;
					
					if (j-i>right-left) {
						System.out.println("j-i is "+(j-i));
						System.out.println("right - left is"+(right-left));
						left=i;
						right=j;
					}
					
				}
				
			}
			
		}
		
		
		return s.substring(left, right+1);
	}

}
