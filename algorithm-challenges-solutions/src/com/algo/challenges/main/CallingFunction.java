package com.algo.challenges.main;

import com.challenges.algo.leetcode.LongestPalindromeSubString;
import com.challenges.algo.leetcode.LongestSubStringWORepeat;
import com.challenges.algo.leetcode.MedianOfArray;
import com.challenges.algo.leetcode.TwoSum;
import com.challenges.algo.leetcode.TwoSumListNodes;
import com.challenges.algo.leetcode.ZigZag;

public class CallingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***************************************************
		//Add two lists
		/*ListNode l1=new ListNode(2);
		ListNode l10=new ListNode(4);
		ListNode l100=new ListNode(3);
		l1.next=l10;
		l10.next=l100;
		
		ListNode l2=new ListNode(5);
		ListNode l20=new ListNode(6);
		ListNode l200=new ListNode(4);
		l2.next=l20;
		l20.next=l200;
		
		TwoSumListNodes tn=new TwoSumListNodes();
		ListNode ans=tn.addTwoNumbers(l1, l2);
			System.out.println(ans.val);
			System.out.println(ans.next.val);
			System.out.println(ans.next.next.val);*/
			
		
		
		//***********************************************
		
		//**********************************************
		//Two Sum
		/*TwoSum ts=new TwoSum();
		int[] arr=ts.twoSum(new int[]{2 ,4,9,11},11);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
*/
		
		//******************************************
		//******************************************
		//Max String without repeating character
		/*LongestSubStringWORepeat lSub=new LongestSubStringWORepeat();
		int length=lSub.lengthOfLongestSubString("abcabcbb");
		System.out.println(length);*/
		
		//********************************************
		//********************************************
		//Median of sorted arrays
		/*int[] x= {1,3,8,9,15};
		int[] y= {7,11,19,21,28,31};*/
		/*int[] x= {1,3};
		int[] y= {2};
		MedianOfArray md=new MedianOfArray();
		double c=md.findMedianSortedArrays(x, y);
		System.out.println(c);*/
		
		//**************************************************
		//*************************************************
		//Longest Palindrome
		/*LongestPalindromeSubString lps=new LongestPalindromeSubString();
		String r=lps.longestPalindrome("babad");
		System.out.println(r);*/
		
		//**************************************************
		//*************************************************
		//zig zag
		String s="paypalishiring";
		int numRows=3;
		ZigZag z=new ZigZag();
		System.out.println(z.convert(s, numRows));;
		
	}

}
