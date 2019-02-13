package com.challenges.algo.leetcode;

public class PalindromeNumber {
	
	 public boolean isPalindrome(int x) {
	     int reverse=0;   
		 if(x<0 || x!=0 || x%10==0) {
			 return false;
		 }
		 
		 boolean isNegative=false;
		 if(x<0) {
			 isNegative=true;
			 x=0-x;
		 }
		 while(x!=0) {
			 reverse=reverse*10+x%10;
			
			 x=x/10;
			 
		 }
		 if (isNegative) {
			reverse=-reverse;
		}
		 
		 return reverse==x;
	    }

}
