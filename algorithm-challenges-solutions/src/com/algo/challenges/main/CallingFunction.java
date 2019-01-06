package com.algo.challenges.main;

import com.challenges.algo.leetcode.TwoSum;

public class CallingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***************************************************
		//Add two lists
		ListNode l1=new ListNode(2);
		ListNode l10=new ListNode(4);
		ListNode l100=new ListNode(3);
		l1.next=l10;
		l10.next=l100;
		
		ListNode l2=new ListNode(5);
		ListNode l20=new ListNode(6);
		ListNode l200=new ListNode(4);
		l2.next=l20;
		l20.next=l200;
		
		TwoSum tn=new TwoSum();
		ListNode ans=tn.addTwoNumbers(l1, l2);
		for (int i = 0; i <2; i++) {
			System.out.println(ans.next.val);
		}
		
		//***********************************************
		
		//**********************************************
		

	}

}
