package com.algo.challenges.main;

import java.util.List;

import com.challenges.algo.leetcode.Atoi;
import com.challenges.algo.leetcode.FourSum;
import com.challenges.algo.leetcode.IntToRoman;
import com.challenges.algo.leetcode.LettersOfPhone;
import com.challenges.algo.leetcode.LongestCommonPrefix;
import com.challenges.algo.leetcode.LongestPalindromeSubString;
import com.challenges.algo.leetcode.LongestSubStringWORepeat;
import com.challenges.algo.leetcode.MedianOfArray;
import com.challenges.algo.leetcode.MostWater;
import com.challenges.algo.leetcode.PalindromeNumber;
import com.challenges.algo.leetcode.RemoveNodeFromList;
import com.challenges.algo.leetcode.ThreeSumClosest;
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
		/*String s="paypalishiring";
		int numRows=3;
		ZigZag z=new ZigZag();
		System.out.println(z.convert(s, numRows));;*/
		
		//**********************************************
		//**********************************************
		//string to int
		/*Atoi atoi=new Atoi();
		System.out.println(atoi.myAtoi("-91283472332"));*/
		
		//**********************************************
		//********************************************
		//Palindrome
		/*PalindromeNumber pn=new PalindromeNumber();
		System.out.println(pn.isPalindrome(-1221));*/
		
		//**********************************************
		//*********************************************
		/*MostWater mw=new MostWater();
		System.out.println(mw.maxArea(new int[] {2,5,1,6,7,3}));*/
		
		//**********************************************
		//**********************************************
		/*IntToRoman ir=new IntToRoman();
		
		System.out.println(ir.intToRoman(3));*/
		
		//*********************************************
		//*********************************************
		/*LongestCommonPrefix lcp=new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(new String[] {"aasd","aaaabc","aap"}));*/
		
		
		//*********************************************
		//************************************************
		
		//3sum closest
		/*ThreeSumClosest tsc=new ThreeSumClosest();
		System.out.println(tsc.threeSumClosest(new int[] {-1,2,1,-4}, 1));*/
		
		//*********************************************
		//************************************************
		//phone number combination
		
		/*LettersOfPhone lp=new LettersOfPhone();
		List<String> r=lp.phoneNumberCombo("34");
		for (String string : r) {
			System.out.println(string);*/
		
		//*********************************************
		//***************************************
		/*ListNode l0=new ListNode(1);
		ListNode l1=new ListNode(2);
		ListNode l10=new ListNode(3);
		ListNode l100=new ListNode(4);
		ListNode l1000=new ListNode(5);
		l0.next=l1;
		l1.next=l10;
		l10.next=l100;
		l100.next=l1000;
		
		RemoveNodeFromList tn=new RemoveNodeFromList();
		ListNode ans=tn.removeNthFromEnd(l0, 2);
			System.out.println(ans.val);
			System.out.println(ans.next.val);
			System.out.println(ans.next.next.val);
			System.out.println(ans.next.next.next.val);*/
		
		//*************************************************
		//************************************************
		FourSum fs = new FourSum();
		List<List<Integer>> re=fs.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
		for (List<Integer> l : re) {
			System.out.println(l.toString());
			
		}
			
		}
		
}


