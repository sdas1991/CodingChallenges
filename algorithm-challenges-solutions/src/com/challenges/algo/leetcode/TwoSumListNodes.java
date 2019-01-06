package com.challenges.algo.leetcode;

import com.algo.challenges.main.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class TwoSumListNodes {
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode dummy=new ListNode(0);
	int carry=0;
	ListNode l3=dummy;
	
	while (l1!=null && l2!=null) {
		int value=(l1.val + l2.val+carry)%10;
		carry=(l1.val + l2.val+carry)/10;
		ListNode newNode=new ListNode(value);
		
		l3.next=newNode;
		l3=newNode;
		l1=l1.next;
		l2=l2.next;
	}
	
	while (l1!=null) {
		int value=(l1.val+carry)%10;
		carry=(l1.val+carry)/10;
		ListNode newNode=new ListNode(value);
		
		l3.next=newNode;
		l3=newNode;
		l1=l1.next;
	}
	
	while ( l2!=null) {
		int value=( l2.val+carry)%10;
		carry=(l2.val+carry)/10;
		ListNode newNode=new ListNode(value);
		
		l3.next=newNode;
		l3=newNode;
		l2=l2.next;
		
	}
	
	if(carry!=0) {
ListNode newNode=new ListNode(carry);
		
		l3.next=newNode;
		l3=newNode;
		
	}
	System.out.println("dummy.next= "+dummy.next.val);
	return dummy.next;
	
        
    }

}
