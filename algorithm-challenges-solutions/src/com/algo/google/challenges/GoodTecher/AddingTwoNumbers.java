package com.algo.google.challenges.GoodTecher;

public class AddingTwoNumbers {

    public static ListNode addTwoNum(ListNode l1, ListNode l2){
        ListNode pointer=new ListNode(0);
        ListNode dummy=pointer;
        int node = 0;
        int carry=0;

        while(l1.next!=null && l2!=null){
            node =(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;
            ListNode newNode=new ListNode(node);
            pointer.next=newNode;
            pointer=newNode;

            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            node =(l1.val+carry)%10;
            carry=(l1.val+carry)/10;
            ListNode newNode=new ListNode(node);
            pointer.next=newNode;
            pointer=newNode;

            l1=l1.next;

        }
        while(l2!=null){
            node =(l2.val+carry)%10;
            carry=(l2.val+carry)/10;
            ListNode newNode=new ListNode(node);
            pointer.next=newNode;
            pointer=newNode;

            l2=l2.next;

        }
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            pointer.next=newNode;
            pointer=newNode;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }



}
